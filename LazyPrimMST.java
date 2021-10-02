
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author colegilbert Machine Learning 1/15/2020
 */
public class LazyPrimMST {

    private LinkedList<StateGraph.Edge> mst;
    private PriorityQueue<StateGraph.Edge> pq; //minimum....?

    public LazyPrimMST(State[] G) {
        //PriorityQueue<State>(new Comparator<State>()
        pq = new PriorityQueue<StateGraph.Edge>();
        mst = new LinkedList<StateGraph.Edge>();

        //visit(G, );
        while (!pq.isEmpty()) {
            StateGraph.Edge e = pq.poll();
            if (e.from().marked() && e.to().marked()) {
                continue;
            }
            mst.addLast(e);
            if (!e.from().marked()) {
                visit(G, e.from());
            }
            if (!e.to().marked()) {
                visit(G, e.to());
            }
        }
    }

    private void visit(State[] G, StateGraph.Vertex v) {
        v.mark();
//        for(StateGraph.Edge e : G){
//            if(!e.to().marked()){
//                pq.add(e);
//            }
        //}
    }

    public Iterable<StateGraph.Edge> edges() {
        return mst;
    }

//    public double weight() {
//        return StateGraph.Edge.length();
//    }
}
