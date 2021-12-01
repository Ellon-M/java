import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;

public class GraphVertex {
    Integer v;
    private GraphEdge edgeA;
    private GraphEdge edgeB;
    private GraphEdge edge;
    private Collection<GraphEdge> edges;
    private GraphVertex vertex;


    public GraphVertex(Integer value) {
        if (value == null) {
            throw new NullPointerException("Vertex must have a value");
        }
        this.v = value;
    }

    private Integer edgeComparator(GraphEdge edgeA, GraphEdge edgeB) {
        if (Objects.equals(edgeA.getKey(), edgeB.getKey())) {
            return 0;
        } else {
            return -1;
        }
    }


    public Integer getKey() {
        return this.v;
    }


    public GraphVertex addEdge(GraphEdge edge) {
        edges.add(edge);
        return this;
    }


    public void deleteEdge(Integer edgeIndex) {
        edges.remove(edgeIndex);
    }


    public ArrayList<GraphEdge> getEdges() {
        ArrayList<GraphEdge> foundEdges = new ArrayList<>();
        for (GraphEdge e: this.edges) {
            foundEdges.add(e);
        }
        return foundEdges;
    }


    public Integer getDegree() {
        return this.edges.size();
    }


    public ArrayList<GraphEdge> findEdge() {
        ArrayList<GraphEdge> foundEdge = new ArrayList<>();
        for (GraphEdge e: this.edges) {
            if (e.startVertex == this || e.endVertex == this) {
                foundEdge.add(e);
            }
        }
        if (foundEdge.size() == 0){
            return null;
        }
        return foundEdge;
    }


    public boolean hasEdge(GraphEdge requiredEdge) {
        return this.edges.contains(requiredEdge);
    }


    public ArrayList<GraphVertex> getNeighbors() {
        ArrayList<GraphVertex> neighboursFound = new ArrayList<>();
        for (GraphEdge e: this.edges) {
            if (e.startVertex == this) {
                neighboursFound.add(e.endVertex);
            }
            neighboursFound.add(e.startVertex);
        }
        // return either startVertex or endVertex of edge belonging to the current vertex
        return neighboursFound;
    }


    // eval to true if get neighbors array has elements
    public boolean hasNeighbor(GraphVertex vertex) {
        return vertex.getNeighbors().size() > 0;
    }
}
