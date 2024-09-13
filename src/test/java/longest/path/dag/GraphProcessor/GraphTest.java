package longest.path.dag.GraphProcessor;

import longest.path.dag.Model.Edge;
import longest.path.dag.Model.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphTest {
    private Graph graph;
    private Vertex vertex1;
    private Vertex vertex2;

    /**
     * This method is executed before each test. It sets up the testing environment.
     */
    @BeforeEach
    void setUp() {
        graph = new Graph();
        vertex1 = new Vertex(1L);
        vertex2 = new Vertex(2L);
    }

    /**
     * This test checks if the addVertex method of the Graph class increases the vertex count.
     */
    @Test
    void addVertex_increasesVertexCount() {
        graph.addVertex(vertex1);
        assertEquals(1, graph.getVertices().size());
    }

    /**
     * This test checks if the addEdge method of the Graph class increases the edge count.
     */
    @Test
    void addEdge_increasesEdgeCount() {
        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addEdge(vertex1, vertex2);
        assertEquals(1, graph.getEdges().size());
    }

    /**
     * This test checks if the getEdges method of the Graph class returns the correct edges.
     */
    @Test
    void getEdges_returnsCorrectEdges() {
        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        graph.addEdge(vertex1, vertex2);
        List<Edge> edges = graph.getEdges();
        assertEquals(1, edges.size());
        assertEquals(vertex1, edges.get(0).getFrom());
        assertEquals(vertex2, edges.get(0).getTo());
    }

    /**
     * This test checks if the getVertices method of the Graph class returns the correct vertices.
     */
    @Test
    void getVertices_returnsCorrectVertices() {
        graph.addVertex(vertex1);
        graph.addVertex(vertex2);
        List<Vertex> vertices = graph.getVertices();
        assertEquals(2, vertices.size());
        assertTrue(vertices.contains(vertex1));
        assertTrue(vertices.contains(vertex2));
    }
}