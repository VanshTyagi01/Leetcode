
import java.util.*;
public class GraphUsingadjList {
    public static void main(String[] args) {
        final int v = 5; // i hav 5 vertices(node)

        // use adj List
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        // add the edges
        graph.get(0).add(2);
        graph.get(0).add(1);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(2).add(1);
        graph.get(3).add(1);
        graph.get(4).add(1);
        
        for(int i=0; i< v; i++){
            System.out.print("Vertex "+i+" --> ");
            for(int j = 0; j<graph.get(i).size(); j++){
                System.out.print(graph.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
