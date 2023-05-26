package graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyListGraph implements Graphable {
    private List<Integer>[] adjacencyList;
    private int numVertex = 0;
    private GraphType graphType = GraphType.DIRECTED;

    public AdjacencyListGraph(GraphType graphType, int numVertex) {
        this.numVertex = numVertex;
        this.adjacencyList = new List[numVertex];
        this.graphType = graphType;
        // inicializojme per shkak se secili element i kesaj arrayListe eshte NULL
        for (int i = 0; i < numVertex; i++) {
            this.adjacencyList[i] = new ArrayList<>();
        }
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 >= numVertex || vertex1 < 0 || vertex2 >= numVertex || vertex2 < 0)
            throw new IllegalArgumentException("Wrong Vertex!");

        this.adjacencyList[vertex1].add(vertex2);
        if (graphType == GraphType.UNDIRECTED) {
            this.adjacencyList[vertex2].add(vertex1);
        }

    }

    @Override
    public List<Integer> getAdjacentVertices(int vertex) {
        if (vertex >= numVertex || vertex < 0)
            throw new IllegalArgumentException("Wrong Vertex");
        return this.adjacencyList[vertex];
    }

    @Override
    public void print() {
        int v = 0;
        for (List<Integer> vertexList : adjacencyList) {
            System.out.print(v + " -> ");
            for (int vertex : vertexList) {
                System.out.printf("%5d -> ", vertex);
            }
            System.out.println();
            v++;
        }
    }
}
