import java.util.ArrayList;


/**
 *
 * @author colegilbert
 */
public class AntColonyOptimization {
    //static ArrayList<StateGraph.Edge> startingPath;
    private double[][] pheromoneMatrix = null;
    private double[][] distancesMatrix = null;
    private ArrayList<StateGraph.Vertex> path;
    private int pathSize;
    
    public AntColonyOptimization(ArrayList<StateGraph.Vertex> startingPath){
        path = startingPath;
        pathSize = path.size();
        startDistances();
        startPheromones();
    }
    
    public int getPathSize() {
    return pathSize;
    }
    
    public ArrayList<StateGraph.Vertex> getStartingPath(){
        return path;
    }
    
    public double[][] getPheremoneMatrix (){
        return pheromoneMatrix;
    }
    
    public double[][] getDistancesMatrix() {
        return distancesMatrix;
    }
    
    public boolean compareAndSetPheremoneMatrix(double d, int x, int y){
        Double p = pheromoneMatrix[x][y];
        pheromoneMatrix[x][y] = d;        
        if(p.equals(d)){
            return true;
        }
        return false;
    }    
    private void startDistances() {
        distancesMatrix = new double[pathSize + 1][pathSize + 1];
        int x = 0;
        int y = 0;
        for(StateGraph.Vertex s1 : path){
            for(StateGraph.Vertex s2 : path){
                StateGraph.Edge edge = new StateGraph.Edge(s1, s2);
                distancesMatrix[x][y] = edge.length();
                y++;
            }
            x++;
        }
    }
    
    private void startPheromones() {
        pheromoneMatrix = new double[pathSize][pathSize];
        for(int i = 0; i < pathSize; i++){
            for(int j = 0; j < pathSize; j++){
                pheromoneMatrix[i][j] = 0.000001;
            }
        }
    }
}
