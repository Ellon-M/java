import java.util.*;

public class Graph {

    private HashMap<Integer, GraphVertex> vertices = new HashMap<Integer, GraphVertex>();
    private HashMap<String, GraphEdge> edges = new HashMap<>();
    boolean isDirected;

    public Graph(boolean directed) {
        this.isDirected = directed;
        directed = false;
    }

    public Graph addVertex(GraphVertex newVertex) {
        vertices.put(newVertex.getKey(), newVertex);
        return this;
    }

    public GraphVertex getVertexByKey(Integer vertexKey) {
        return vertices.get(vertexKey);
    }

    public ArrayList getAllVertices() {
        ArrayList<Integer> allVertices = new ArrayList<>();
        vertices.forEach( (k, v) -> {
            allVertices.add(k);
        });
        return allVertices;
    }

    public Collection<GraphVertex> getAllVerticesSub() {
        return this.vertices.values();
    }

    public ArrayList getAllEdges() {
        ArrayList<GraphEdge> allEdges = new ArrayList<>();
        edges.forEach( (k, e) -> allEdges.add(e));
        return allEdges;
    }

    public Collection<GraphEdge> getAllEdgesSub() {
        return this.edges.values();
    }

    public Graph addEdge(GraphEdge edge) throws Exception {
        GraphVertex startVertex;
        GraphVertex endVertex;

        startVertex = this.getVertexByKey(edge.startVertex.getKey());
        endVertex = this.getVertexByKey(edge.endVertex.getKey());

        // if no start vertex, insert
        if (startVertex == null) {
            this.addVertex(edge.startVertex);
            startVertex = this.getVertexByKey(edge.startVertex.getKey());
        }

        // if no end vertex, insert
        if (endVertex == null) {
            this.addVertex(edge.endVertex);
            endVertex = this.getVertexByKey(edge.endVertex.getKey());
        }

        if (this.edges.containsKey(edge.getKey())){
            throw new Exception("Edge already added");
        } else {
            edge = this.edges.get(edge.getKey());
        }

        // add edge to vertices
        // if graph is directed, add edge only to start vertex
        if (this.isDirected) {
            startVertex.addEdge(edge);
        } else {
            startVertex.addEdge(edge);
            endVertex.addEdge(edge);
        }

        return this;
    }

    public void deleteEdge(GraphEdge edge) throws Exception {
        // delete edge from list of edges


        if (this.edges.get(edge.getKey()) != null) {
            this.edges.remove(edge.getKey());
        } else {
            throw new Exception("Edge not found in graph");
        }

        GraphVertex startVertex;
        GraphVertex endVertex;

        startVertex = this.getVertexByKey(edge.startVertex.getKey());
        endVertex = this.getVertexByKey(edge.endVertex.getKey());

        startVertex.deleteEdge(edge.getKey());
        endVertex.deleteEdge(edge.getKey());
    }

    public int getWeights() {
        return this.getAllEdgesSub().stream().reduce(0, (weight, graphEdge) -> weight + graphEdge.weight, Integer::sum);
    }

    public Graph reverse() {
        this.getAllEdgesSub().forEach(edge -> {
            // delete straight edge from graph an d vertices
            try {
                this.deleteEdge(edge);
            } catch (Exception e) {
                e.printStackTrace();
            }
            edge.reverse();
            try {
                this.addEdge(edge);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return this;
    }

//    public List<List<Integer>> getAdjancencyMatrix() {
//
//    }

//    public ArrayList getVerticesIndices() {
//
//    }

  public GraphEdge findEdge(GraphVertex startVertex, GraphVertex endVertex) {
        GraphVertex vertex = this.getVertexByKey(startVertex.getKey());

        if (vertex.getKey() == null) {
            return null;
        }

       return vertex.findEdge().remove(0);
    }
}

