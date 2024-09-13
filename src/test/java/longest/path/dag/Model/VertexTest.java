package longest.path.dag.Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VertexTest {
    private Vertex vertex;

    /**
     * This method is executed before each test. It sets up the testing environment.
     */
    @BeforeEach
    void setUp() {
        vertex = new Vertex(1L);
    }

    /**
     * This test checks if the getId method of the Vertex class returns the correct id.
     */
    @Test
    void getId_returnsCorrectId() {
        assertEquals(1L, vertex.getId());
    }

    /**
     * This test checks if the equals method of the Vertex class correctly identifies two vertices with the same id as equal.
     */
    @Test
    void equals_withSameId_returnsTrue() {
        Vertex vertex2 = new Vertex(1L);
        assertTrue(vertex.equals(vertex2));
    }

    /**
     * This test checks if the equals method of the Vertex class correctly identifies two vertices with different ids as not equal.
     */
    @Test
    void equals_withDifferentId_returnsFalse() {
        Vertex vertex2 = new Vertex(2L);
        assertFalse(vertex.equals(vertex2));
    }

    /**
     * This test checks if the hashCode method of the Vertex class returns the same hash code for two vertices with the same id.
     */
    @Test
    void hashCode_withSameId_returnsSameHashCode() {
        Vertex vertex2 = new Vertex(1L);
        assertEquals(vertex.hashCode(), vertex2.hashCode());
    }

    /**
     * This test checks if the hashCode method of the Vertex class returns different hash codes for two vertices with different ids.
     */
    @Test
    void hashCode_withDifferentId_returnsDifferentHashCode() {
        Vertex vertex2 = new Vertex(2L);
        assertNotEquals(vertex.hashCode(), vertex2.hashCode());
    }
}