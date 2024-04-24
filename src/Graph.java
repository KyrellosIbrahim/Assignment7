import java.util.*;

public class Graph {
    private int V;
    private LinkedList<Edge>[] adj;
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    public void addEdge(int u, int v, int w) {
        adj[u].add(new Edge(v, w));
    }

    public void printPathsOfLength5(int u, int w, boolean[] visited, ArrayList<Integer> path, int pathLength) {
        visited[u] = true;
        path.add(u);
        pathLength++;

        // If the current path has length 5 and the current vertex is the destination
        if (pathLength == 5 && u == w) {
            System.out.println(path);
        } else if (pathLength <= 5) {
            // Traverse all the neighbors of the current vertex
            for (Edge edge : adj[u]) {
                int neighbor = edge.destination;
                if (!visited[neighbor]) {
                    printPathsOfLength5(neighbor, w, visited, path, pathLength);
                }
            }
        }

        // Remove the current vertex from the path and mark it as unvisited
        path.remove(path.size() - 1);
        visited[u] = false;
    }

    void printPaths(int u, int w) {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> path = new ArrayList<>();
        printPathsOfLength5(u, w, visited, path, 0);
    }

}
