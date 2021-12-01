public class GraphEdge {
    public GraphVertex startVertex;
    public GraphVertex endVertex;
    public Integer weight = 1;

    public GraphEdge(GraphVertex startV, GraphVertex endV, Integer w) {
        GraphVertex startVertex = startV;
        GraphVertex endVertex = endV;
        Integer weight = w;
    }

    public int getKey() {
        Integer startVertexKey = startVertex.getKey();
        Integer endVertexKey = endVertex.getKey();

        return(startVertexKey - endVertexKey);
    }

    public GraphEdge reverse() {
        GraphVertex tmp = this.startVertex;
        this.startVertex = this.endVertex;
        this.endVertex = tmp;

        return this;
    }

    public String toString() {
        return "" + this.getKey() + "";
    }
}
