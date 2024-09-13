package longest.path.dag.GraphProcessor;

import longest.path.dag.Model.Edge;
import longest.path.dag.Model.Vertex;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Vertex> vertices;
    private List<Edge> edges;

    public Graph() {
        this.vertices = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

    // Add a vertex to the graph
    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
    }

    // Add a directed edge to the graph
    public void addEdge(Vertex from, Vertex to) {
        Edge edge = new Edge(from, to);
        edges.add(edge);
    }

    // Get the list of edges
    public List<Edge> getEdges() {
        return edges;
    }

    // Get all vertices
    public List<Vertex> getVertices() {
        return vertices;
    }
}

