import java.util.ArrayList;
import java.util.Iterator;

public class StateGraph { 

    public static class Vertex {

        private static ArrayList<Vertex> vertices = new ArrayList<Vertex>();

        private int index;
        private State state;
        private Vertex parent;    // A parent pointer for a DFS/BFS/MST tree
        private boolean marked;   // A boolean to mark nodes during traversal

        public Vertex(State state) {
            Vertex.vertices.add(this);
            this.state = state;
            this.parent = null;
            this.marked = false;
            this.index = Vertex.vertices.size();
        }

        public static int numberVertices() { // Number vertices in the graph
            return Vertex.vertices.size();
        }

        public static Vertex vertex(int index) { // Retrieve vertex by index
            return Vertex.vertices.get(index);
        }

        public int index() {
            return this.index;
        }

        public State state() {
            return this.state;
        }

        public Vertex parent() {
            return this.parent;
        }

        public void parent(Vertex parent) {
            this.parent = parent;
        }

        public boolean marked() {
            return this.marked;
        }

        public void mark() {
            this.marked = true;
        }

        public void unark() {
            this.marked = false;
        }

        public boolean equals(Vertex other) {
            return this == other;
        }

        @Override
        public boolean equals(Object other) {
            return this instanceof Vertex &&
                this.equals((Vertex) other);
        }

        @Override
        public String toString() {
            return this.state.code();
        }

        public static Iterable<Vertex> vertices() {

            // Convenient iterator for the vertices in a graph:
            //
            // for (Vertex vertex : Vertex.vertices) {
            //    ...
            // }

            return new Iterable<Vertex>() {
                public Iterator<Vertex> iterator() {
                    return Vertex.vertices.iterator();
                }
            };
        }
    }
    


    public static class Edge implements Comparable<Edge> {

        private Vertex from;
        private Vertex to;
        private double length;

        public Edge(Vertex from, Vertex to) {
            this.length = from.state.capital().distance(to.state.capital());
            this.from = from;
            this.to = to;
        }

        public Vertex from() {
            return this.from;
        }

        public Vertex to() {
            return this.to;
        }

        public double length() {
            return this.length;
        }

        public boolean equals(Edge other) {
            return this.from.equals(other.from) &&
                this.to.equals(other.to);
        }

        @Override
        public boolean equals(Object other) {
            return other instanceof Edge &&
                this.equals((Edge) other);
        }

        @Override
        public String toString() {
            return "(" + this.from + "," + this.to + ")";
        }

        @Override
        public int compareTo(Edge other) {
            if (this.length < other.length) {
                return -1;
            } else if (this.length > other.length) {
                return +1;
            } else {
                return 0;
            }
        }
    }
}
