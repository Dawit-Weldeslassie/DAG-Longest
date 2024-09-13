package longest.path.dag;

import longest.path.dag.GraphProcessor.Graph;
import longest.path.dag.GraphProcessor.GraphBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
class DagApplicationTests {

    private DagApplication dagApplication;

    private GraphBuilder graphBuilder;

    @BeforeEach
    void setUp() {
        dagApplication = new DagApplication();
        graphBuilder = new GraphBuilder();
    }

    @Test
    void main_createsGraphWithVerticesAndEdges() {
        Graph graph = graphBuilder.buildGraph();

        assertEquals(5, graph.getVertices().size());
        assertEquals(5, graph.getEdges().size());
    }
}
