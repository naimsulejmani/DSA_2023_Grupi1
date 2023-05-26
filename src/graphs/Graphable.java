package graphs;

import java.util.List;

public interface Graphable {
    void addEdge(int vertex1, int vertex2);

    List<Integer> getAdjacentVertices(int vertex);

    void print();
}
