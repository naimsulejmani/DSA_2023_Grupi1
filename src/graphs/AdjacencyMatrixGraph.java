package graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph implements Graphable {
    private int[][] adjacencyMatrix;
    private GraphType graphType = GraphType.DIRECTED;
    private int numVertices = 0;

    public AdjacencyMatrixGraph(GraphType graphType, int numVertices) {
        this.graphType = graphType;
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    @Override
    public void addEdge(int vertex1, int vertex2) {
        if (vertex1 >= numVertices || vertex1 < 0 ||
                vertex2 >= numVertices || vertex2 < 0) {
            throw new IllegalArgumentException("Invalid Vertex selected!");
        }
        adjacencyMatrix[vertex1][vertex2] = 1;
        if (graphType == GraphType.UNDIRECTED) {
            adjacencyMatrix[vertex2][vertex1] = 1;
        }
    }
    @Override
    public List<Integer> getAdjacentVertices(int vertex) {
        if (vertex >= numVertices || vertex < 0) {
            throw new IllegalArgumentException("Invalid Vertex selected!");
        }
        List<Integer> adjacencyVertices = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[vertex][i] == 1) {
                adjacencyVertices.add(i);
            }
        }
        return adjacencyVertices;
    }

    @Override
    public void print() {
        for (int[] row : adjacencyMatrix) {
            for (int vertex : row) {
                System.out.printf("%5d", vertex);
            }
            System.out.println();
        }
    }
}





