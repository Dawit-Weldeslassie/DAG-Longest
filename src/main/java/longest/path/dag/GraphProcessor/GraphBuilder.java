package longest.path.dag.GraphProcessor;

import longest.path.dag.Model.Edge;
import longest.path.dag.Model.Vertex;

public class GraphBuilder {

    public Graph buildGraph() {
        Graph graph = new Graph();

        // Create vertices
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        // Add vertices to the graph
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        // Add edges
        graph.addEdge(v1, v2);
        graph.addEdge(v1, v3);
        graph.addEdge(v2, v4);
        graph.addEdge(v3, v4);
        graph.addEdge(v4, v5);

        for (Edge edge : graph.getEdges()) {
            // Printing the source and target vertices of each edge
            System.out.println("Edge from Vertex " + edge.getFrom().getId() + " to Vertex " + edge.getTo().getId());
        }

        return graph;
    }
}