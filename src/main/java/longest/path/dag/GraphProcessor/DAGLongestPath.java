package longest.path.dag.GraphProcessor;

import longest.path.dag.Model.Vertex;

import java.util.*;

public class DAGLongestPath {

    // Topological sorting utility function
    private void topologicalSortUtil(Vertex v, Set<Vertex> visited, Stack<Vertex> stack, Map<Vertex, List<Vertex>> adjList) {
        visited.add(v);
        for (Vertex neighbor : adjList.get(v)) {
            if (!visited.contains(neighbor)) {
                topologicalSortUtil(neighbor, visited, stack, adjList);
            }
        }
        stack.push(v);
    }

    // Topological sorting for all vertices
    private Stack<Vertex> topologicalSort(Set<Vertex> vertices, Map<Vertex, List<Vertex>> adjList) {
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();

        for (Vertex v : vertices) {
            if (!visited.contains(v)) {
                topologicalSortUtil(v, visited, stack, adjList);
            }
        }

        return stack;
    }

    // Function to find the longest path from a given vertex
    public Map<Vertex, Integer> findLongestPath(Vertex startVertex, Set<Vertex> vertices, Map<Vertex, List<Vertex>> adjList) {
        Stack<Vertex> stack = topologicalSort(vertices, adjList);
        Map<Vertex, Integer> distances = new HashMap<>();

        for (Vertex v : vertices) {
            distances.put(v, Integer.MIN_VALUE);
        }
        distances.put(startVertex, 0);

        while (!stack.isEmpty()) {
            Vertex u = stack.pop();
            if (distances.get(u) != Integer.MIN_VALUE) {
                // Check if the vertex has any outgoing edges
                if (adjList.get(u) != null) {
                    for (Vertex v : adjList.get(u)) {
                        if (distances.get(v) < distances.get(u) + 1) {
                            distances.put(v, distances.get(u) + 1);
                        }
                    }
                }
            }
        }


        return distances;
    }
}

