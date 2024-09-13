package longest.path.dag.GraphProcessor;

import longest.path.dag.Model.Edge;
import longest.path.dag.Model.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GraphBuilderTest {
    private GraphBuilder graphBuilder;

    @BeforeEach
    void setUp() {
        graphBuilder = new GraphBuilder();
    }

    @Test
    void buildGraph_createsCorrectGraph() {
        Graph graph = graphBuilder.buildGraph();

        assertEquals(5, graph.getVertices().size());
        assertEquals(5, graph.getEdges().size());

        assertTrue(graph.getVertices().contains(new Vertex(1)));
        assertTrue(graph.getVertices().contains(new Vertex(2)));
        assertTrue(graph.getVertices().contains(new Vertex(3)));
        assertTrue(graph.getVertices().contains(new Vertex(4)));
        assertTrue(graph.getVertices().contains(new Vertex(5)));

        assertTrue(graph.getEdges().contains(new Edge(new Vertex(1), new Vertex(2))));
        assertTrue(graph.getEdges().contains(new Edge(new Vertex(1), new Vertex(3))));
        assertTrue(graph.getEdges().contains(new Edge(new Vertex(2), new Vertex(4))));
        assertTrue(graph.getEdges().contains(new Edge(new Vertex(3), new Vertex(4))));
        assertTrue(graph.getEdges().contains(new Edge(new Vertex(4), new Vertex(5))));
    }
}