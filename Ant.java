
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author colegilbert
 */
public class Ant {

    //change in pheremone levels = Q / length if ant uses the edge, otherwise change is 0
    public static final double Q = 0.00049;
    public static final double RANDOM = 0.2059;
    public static final double ALPHA = 0.02;
    public static final double BETA = 10.0;

    private AntColonyOptimization aco;
    private int antNumber;
    private Tour trail; // this is the path each individual ant follows

    static int INVALID = -1; //invalid vertex index
    private int pathSize;

    public Ant(AntColonyOptimization aco, int antNumber) {
        this.pathSize = aco.getPathSize();
        this.aco = aco;
        this.antNumber = antNumber;
    }

    public Tour getTrail() {
        return trail;
    }

    public Ant send() {
        int startingVertex = (int) (Math.random() * pathSize);
        ArrayList<StateGraph.Vertex> vertexTrail = new ArrayList<StateGraph.Vertex>(pathSize);
        HashMap<State, Boolean> visited = new HashMap<State, Boolean>(pathSize);
        int numVisited = 0;
        double trailDistance = 0.0;
        int x = startingVertex;
        int y = INVALID;

        visited.put(aco.getStartingPath().get(startingVertex).state(), Boolean.TRUE);

        if (numVisited != aco.getPathSize()) {
            y = findY(x, visited);
        }
        while (y != INVALID) {
            vertexTrail.add(numVisited++, aco.getStartingPath().get(x));
            trailDistance += aco.getDistancesMatrix()[x][y];
            updatePheromone(x, y, trailDistance);
            visited.put(aco.getStartingPath().get(y).state(), Boolean.TRUE);
            x = y; //moves to next vertex
            if (numVisited != aco.getPathSize()) {
                y = findY(x, visited);
            } else {
                y = INVALID;
            }
        }

        State[] verticies = new State[vertexTrail.size()]; // convert it to State[] so it works with the hashmap
        for (int i = 0; i < verticies.length; i++) {
            verticies[i] = vertexTrail.get(i).state();
        }

        trailDistance += aco.getDistancesMatrix()[x][startingVertex];
        vertexTrail.add(numVisited, aco.getStartingPath().get(x));
        trail = new Tour(verticies, trailDistance);
        return this;
    }

    private int findY(int x, HashMap<State, Boolean> visited) {
        int y = INVALID;
        double random = Math.random();
        ArrayList<Double> nextEdgeProbability = findNextEdgeProbability(x, visited);
        for (int i = 0; i < pathSize; i++) {
            if (random < nextEdgeProbability.get(i)) {
                y = i;
                break;
            } else {
                random -= nextEdgeProbability.get(i);
            }
        }
        return y;
    }
    
    private void updatePheromone(int x, int y, double distance){
        boolean tf = true;
        while(true){
            double currentPheremone = aco.getPheremoneMatrix()[x][y];
            double newPheremone = (1 - RANDOM) * currentPheremone + Q/distance;
            if(newPheremone < 0.0){
                tf = !aco.compareAndSetPheremoneMatrix(currentPheremone, x, y);
            } else {
                tf = !aco.compareAndSetPheremoneMatrix(currentPheremone, x, y);
            }
        }
    }

    private ArrayList<Double> findNextEdgeProbability(int x, HashMap<State, Boolean> visited) {
        ArrayList<Double> nextEdgeProbability = new ArrayList<Double>(pathSize);
        double denominator = findDenominator(nextEdgeProbability, x, visited);
        for (int i = 0; i < pathSize; i++) {
            nextEdgeProbability.add(0.0); //fill up probabilities       
        }
        for (int j = 0; j < pathSize; j++) {
            nextEdgeProbability.set(j, denominator);
        }
        return nextEdgeProbability;
    }

    private double findDenominator(ArrayList<Double> nextEdgeProbability, int x, HashMap<State, Boolean> visited) {
        double denominator = 0.0;
        for (int i = 0; i < pathSize; i++) {
            if (!visited.get(aco.getStartingPath().get(i).state())) {
                if (x == i) {
                    nextEdgeProbability.set(i, 0.0);
                } else {
                    nextEdgeProbability.set(i, findNumerator(x, i));
                }
                denominator += nextEdgeProbability.get(i);
            }
        }
        return denominator;
    }

    private double findNumerator(int x, int y) {
        double numerator = 0.0;
        double pheremone = aco.getPheremoneMatrix()[y][x];
        if (pheremone != 0.0) {
            numerator = Math.pow(pheremone, ALPHA) * Math.pow(1.0 / aco.getPheremoneMatrix()[y][x], BETA);
        }
        return numerator;
    }

    public int getAntNumber() {
        return antNumber;
    }
}
