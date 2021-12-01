import java.util.*;

public class Dijkstra {

    private final boolean isDirected = false;
    Graph graph = new Graph(isDirected);
    PriorityQueue queue = new PriorityQueue();
    Collection<HashMap> shortestDistances;

    public Collection<HashMap> dijkstra(Graph graph, GraphVertex startVertex) {

        HashMap<Integer, Integer> distances = new HashMap<Integer, Integer>();
        HashMap<Integer, GraphVertex> previousVertices = new HashMap<Integer, GraphVertex>();
        HashMap<Integer, GraphVertex> visitedVertices = new HashMap<Integer, GraphVertex>();
        ArrayList<Integer> verticesArr = new ArrayList<Integer>();
        verticesArr = this.graph.getAllVertices();

        // Init all distances with infinity assuming that currently we can't reach
        // any of the vertices except the start one.
        for (Integer v : verticesArr) {
            distances.put(v, Integer.MAX_VALUE);
            previousVertices.put(v, null);
        }

        // distance to the start vertex is zero
        distances.put(startVertex.getKey(), 0);

        // init vertices queue
        this.queue.add(startVertex.getKey());

        while (!queue.isEmpty()) {

            // fetch next closest vertex
            Integer currentVertexValue = this.queue.poll();
            GraphVertex currentVertex = graph.getVertexByKey(currentVertexValue);

            ArrayList<GraphVertex> neighbors = currentVertex.getNeighbors();

            // iterate over every unvisited neighbor of the current vertex
            for(GraphVertex neighbor: neighbors) {
                //don't visit already visited vertices
                if (visitedVertices.get(neighbor.getKey()) == null) {
                    // update distances to every neighbor from current vertex
                    GraphEdge edge = graph.findEdge(currentVertex, neighbor);
                    Integer existingDistancesToNeighbor = distances.get(neighbor.getKey());
                    Integer distanceToNeighborFromCurrent = distances.get(currentVertex.getKey()) + edge.weight;

                    // if we've found a shorter path to the neighbor, update it
                    if (distanceToNeighborFromCurrent < existingDistancesToNeighbor) {
                        distances.put(neighbor.getKey(), distanceToNeighborFromCurrent);

                        // Change priority of the neighbor in a queue since it might have became closer.
                        if (this.queue.hasValue(neighbor.getKey())) {
                            this.queue.changePriority(neighbor.getKey(), distances.get(neighbor.getKey()));
                        }
                        // remember prev closest vertex
                         previousVertices.put(neighbor.getKey(), currentVertex);
                    }

                    // add neighbor to queue for further visiting
                    if (this.queue.hasValue(neighbor.getKey()) == false) {
                        // include priority
                        this.queue.add(neighbor.getKey(), distances.get(neighbor.getKey()));
                    }
                }
            };

            // Add current vertex to visited ones to avoid visiting it again later
            visitedVertices.put(currentVertex.getKey(), currentVertex);
        }
        // Return the set of shortest distances to all vertices and the set of
        // vertices that follow the shortest path from the defined start vertex.
        this.shortestDistances.add(distances);
        this.shortestDistances.add(previousVertices);

        return this.shortestDistances;
    }
}
