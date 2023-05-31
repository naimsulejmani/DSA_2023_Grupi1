package graphs;

import queues.Queue;
import queues.QueueOverflowException;
import queues.QueueUnderflowException;

import java.util.List;

public interface Graphable {
    void addEdge(int vertex1, int vertex2);

    List<Integer> getAdjacentVertices(int vertex);

    void print();

    public static void depthFirstTraversal(Graphable graph, int[] visited, int currentVertex) {
        if (visited[currentVertex] == 1) return;
        visited[currentVertex] = 1;
        List<Integer> list = graph.getAdjacentVertices(currentVertex);
        for (int vertex : list) {
            depthFirstTraversal(graph, visited, vertex);
        }
        System.out.println(currentVertex + " -> ");
    }

    public static void depthFirstTraversal(Graphable graphable, int[] visited) {
        for (int i = 0; i < visited.length; i++) {
            depthFirstTraversal(graphable, visited, i);
        }
    }

    public static void breadthFirstTraversal(Graphable graph, int[] visited, int currentVertex)
            throws QueueOverflowException, QueueUnderflowException {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(currentVertex);
        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();
            if (visited[vertex] == 1) continue;
            System.out.print(vertex + " -> ");
            visited[vertex] = 1;
            List<Integer> list = graph.getAdjacentVertices(vertex);
            for (int v : list) {
                if (visited[v] != 1)
                    queue.enqueue(v);
            }
        }
    }

    public static void breadthFirstTraversal(Graphable graphable, int[] visited) throws QueueUnderflowException, QueueOverflowException {
        for (int i = 0; i < visited.length; i++) {
            breadthFirstTraversal(graphable, visited, i);
        }
    }
}









