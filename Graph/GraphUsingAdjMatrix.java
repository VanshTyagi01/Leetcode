import java.util.*;
public class GraphUsingAdjMatrix {
    public static void main(String[] args) {
        final int v = 5; // nodes in graph
        int[][] adjMatrix = new int[v][v];
        adjMatrix[0][1] = 1;
        adjMatrix[0][2] = 1;
        adjMatrix[2][0] = 1;
        adjMatrix[2][1] = 1;

        for(int i = 0; i < v; i++){
            System.out.print("Vertex "+i+" --> ");
            for(int j = 0; j < v; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
