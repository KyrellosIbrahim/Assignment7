public class EveryPath {
    public static void main(String[] args) {
        Graph g = new Graph(6);

        g.addEdge(0, 1, 1);
        g.addEdge(0, 2, 3);
        g.addEdge(0, 3, 2);
        g.addEdge(1, 0, 1);
        g.addEdge(1, 2, 1);
        g.addEdge(1, 4, 1);
        g.addEdge(2, 3, 1);
        g.addEdge(2, 4, 1);
        g.addEdge(3, 0, 1);
        g.addEdge(3, 4, 1);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 0, 1);
        g.addEdge(5, 1, 1);
        g.addEdge(5, 2, 1);


        int u = 0;
        int w = 2;

        System.out.println("All paths of length 5 from " + u + " to " + w + ":");
        g.printPaths(u, w);
    }
}
