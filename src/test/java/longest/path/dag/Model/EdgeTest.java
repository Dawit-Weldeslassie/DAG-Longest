package longest.path.dag.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EdgeTest {

    private Vertex source;
    private Vertex target;
    private Edge edge;

    /**
     * This method is executed before each test. It sets up the testing environment.
     */
    @BeforeEach
    void setUp() {
        source = new Vertex(1L);
        target = new Vertex(2L);
        edge = new Edge(source, target);
    }

    /**
     * This test checks if the getFrom method of the Edge class returns the correct source vertex.
     */
    @Test
    void getFrom_returnsCorrectSource() {
        assertEquals(source, edge.getFrom());
    }

    /**
     * This test checks if the getTo method of the Edge class returns the correct target vertex.
     */
    @Test
    void getTo_returnsCorrectTarget() {
        assertEquals(target, edge.getTo());
    }

    /**
     * This test checks if the equals method of the Edge class correctly identifies two edges with different source or target vertices as not equal.
     */
    @Test
    void equals_withDifferentSourceOrTarget_returnsFalse() {
        Edge edge2 = new Edge(new Vertex(3L), target);
        assertFalse(edge.equals(edge2));
    }

    /**
     * This test checks if the hashCode method of the Edge class returns different hash codes for two edges with different source or target vertices.
     */
    @Test
    void hashCode_withDifferentSourceOrTarget_returnsDifferentHashCode() {
        Edge edge2 = new Edge(new Vertex(3L), target);
        assertNotEquals(edge.hashCode(), edge2.hashCode());
    }
}