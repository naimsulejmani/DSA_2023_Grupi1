package graphs;

public class TestAdjacencyMatrix {
    public static void main(String[] args) {
        AdjacencyMatrixGraph amg = new AdjacencyMatrixGraph(GraphType.UNDIRECTED, 5);
        amg.addEdge(0, 1);
        amg.addEdge(0, 2);
        amg.addEdge(1, 2);
        amg.addEdge(1, 3);
        amg.addEdge(2, 4);
        amg.addEdge(3, 4);

        amg.print();

        var kojshite = amg.getAdjacentVertices(1);

        System.out.println("\n\nKojshite e 1-shit: ");
        for (int kojshi : kojshite) {
            System.out.printf("%5d", kojshi);
        }
    }
}
