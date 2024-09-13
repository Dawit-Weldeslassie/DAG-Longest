package longest.path.dag.GraphProcessor;

import longest.path.dag.Model.Vertex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This class contains unit tests for the DAGLongestPath class.
 */
class DAGLongestPathTest {

    private DAGLongestPath dagLongestPath;
    private Vertex vertex1;
    private Vertex vertex2;
    private Vertex vertex3;
    private Set<Vertex> vertices;
    private Map<Vertex, List<Vertex>> adjList;

    /**
     * This method is executed before each test. It sets up the testing environment.
     */
    @BeforeEach
    void setUp() {
        dagLongestPath = new DAGLongestPath();
        vertex1 = new Vertex(1L);
        vertex2 = new Vertex(2L);
        vertex3 = new Vertex(3L);
        vertices = new HashSet<>(Arrays.asList(vertex1, vertex2, vertex3));
        adjList = new HashMap<>();
        adjList.put(vertex1, Collections.singletonList(vertex2));
        adjList.put(vertex2, Collections.singletonList(vertex3));
    }

    /**
     * This test checks if the findLongestPath method of the DAGLongestPath class returns zero for an empty graph.
     */
    @Test
    void findLongestPath_withEmptyGraph_returnsZero() {
        Vertex startVertex = new Vertex(1L);
        Map<Vertex, List<Vertex>> adjList = new HashMap<>();
        adjList.put(startVertex, new ArrayList<>()); // Ensure the startVertex is in the adjacency list
        Map<Vertex, Integer> result = dagLongestPath.findLongestPath(startVertex, Collections.singleton(startVertex), adjList);
        assertEquals(1, result.size()); // Now the size should be 1
        assertEquals(0, result.get(startVertex));
    }

    /**
     * This test checks if the findLongestPath method of the DAGLongestPath class returns zero for a graph with a single vertex.
     */
    @Test
    void findLongestPath_withSingleVertex_returnsZero() {
        // Create an adjacency list with a single vertex that has no outgoing edges
        Map<Vertex, List<Vertex>> adjList = new HashMap<>();
        adjList.put(vertex1, new ArrayList<>()); // Ensure the vertex is added with an empty list of neighbors

        // Now, the adjacency list has an entry for vertex1 with no outgoing edges
        Map<Vertex, Integer> result = dagLongestPath.findLongestPath(vertex1, Collections.singleton(vertex1), adjList);

        // Assert that the longest path to itself is zero
        assertEquals(0, result.get(vertex1));
    }

    /**
     * This test checks if the findLongestPath method of the DAGLongestPath class returns the correct path length for a graph with two vertices and an edge.
     */
    @Test
    void findLongestPath_withTwoVerticesAndEdge_returnsEdgeWeight() {
        // Create vertices
        Vertex vertex1 = new Vertex(1L);
        Vertex vertex2 = new Vertex(2L);
        Vertex vertex3 = new Vertex(3L);

        // Add vertices to the set
        Set<Vertex> vertices = new HashSet<>();
        vertices.add(vertex1);
        vertices.add(vertex2);
        vertices.add(vertex3);

        // Add edges to the adjacency list
        Map<Vertex, List<Vertex>> adjList = new HashMap<>();
        adjList.put(vertex1, Arrays.asList(vertex2)); // vertex1 -> vertex2
        adjList.put(vertex2, new ArrayList<>());      // vertex2 has no outgoing edges
        adjList.put(vertex3, new ArrayList<>());      // vertex3 has no outgoing edges

        // Find the longest path starting from vertex1
        Map<Vertex, Integer> result = dagLongestPath.findLongestPath(vertex1, vertices, adjList);

        // Assert that the longest path from vertex1 to vertex2 is 1 (since there's one edge)
        assertEquals(1, result.get(vertex2));

        // Assert that vertex3 is unreachable (should have the default Integer.MIN_VALUE)
        assertEquals(Integer.MIN_VALUE, result.get(vertex3));
    }
}