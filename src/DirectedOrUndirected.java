public class DirectedOrUndirected {
    public static boolean directedOrUndirected(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{0, 1, 0},
                            {0, 0, 1},
                            {1, 0, 0}}; // Directed
        int[][] matrix2 = {{0, 1, 1},
                            {1, 0, 1},
                            {1, 1, 0}}; // Undirected

        int[][] matrix3 = {{0,1,0,0},
                            {0,0,1,0},
                            {1,0,0,0},
                            {0,1,0,0}}; //directed
        int[][] matrix4 = {{0,1,0,1},
                            {1,0,1,0},
                            {0,1,0,0},
                            {1,0,0,0}}; //undirected

        int[][] matrix5 = {{0, 0, 1, 0, 0},
                            {1, 0, 0, 0, 0},
                            {0, 0, 0, 1, 1},
                            {0, 0, 0, 0, 0},
                            {0, 1, 0, 0, 0}};//directed
        int[][] matrix6 = {{0, 1, 0, 0, 1},
                            {1, 0, 1, 1, 0},
                            {0, 1, 0, 0, 0},
                            {0, 1, 0, 0, 1},
                            {1, 0, 0, 1, 0}};//undirected

        System.out.println(directedOrUndirected(matrix1));
        System.out.println(directedOrUndirected(matrix2));

        System.out.println(directedOrUndirected(matrix3));
        System.out.println(directedOrUndirected(matrix4));

        System.out.println(directedOrUndirected(matrix5));
        System.out.println(directedOrUndirected(matrix6));

    }
}

