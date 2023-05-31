package graphs;

import queues.QueueOverflowException;
import queues.QueueUnderflowException;

public class TestAdjacencyMatrix {
    public static void main(String[] args) throws QueueUnderflowException, QueueOverflowException {
        Graphable amg = new AdjacencyListGraph(GraphType.UNDIRECTED, 5);
        amg.addEdge(0, 1);
        amg.addEdge(0, 2);
        amg.addEdge(1, 0);
        amg.addEdge(2, 1);
        amg.addEdge(3, 2);
        amg.addEdge(3, 4);
        amg.addEdge(4, 1);
        amg.addEdge(4, 3);

        amg.print();

        var kojshite = amg.getAdjacentVertices(1);

        System.out.println("\n\nKojshite e 1-shit: ");
        for (int kojshi : kojshite) {
            System.out.printf("%5d", kojshi);
        }

        System.out.println("\n DFS: ");
        int[] visited = new int[5];
        // Graphable.depthFirstTraversal(amg, visited, 4);
        // Graphable.depthFirstTraversal(amg, visited);
        Graphable.breadthFirstTraversal(amg, visited, 0);

    }
}
