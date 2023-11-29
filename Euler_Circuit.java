package GFG;
import java.util.*;

public class Euler_Circuit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get the number of vertices
        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        // Create an array of lists to represent the adjacency list
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // Get the edges
        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();

        System.out.println("Enter the edges (format: u v):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adj[u].add(v);
            adj[v].add(u); // an undirected graph
        }

        int result = Euler(V, adj);

        if (result == 0) {
            System.out.println("The graph doesn't contain anything.");
        } else if (result == 1) {
            System.out.println("The graph contains an Euler path.");
        } else if (result == 2) {
            System.out.println("The graph has an Euler circuit.");
        }
    }

	
	
	public static int Euler(int V, List<Integer> [] adj) {
		int odd = 0;
		for(int i=0;i<V;i++) {
			if(adj[i].size()%2!=0) {
				odd+=1;
			}
		}
		if(odd>2) {
			return 0;  //graph doesn's contain anything
		}
		if(odd==0) {
			return 2;  //if graph has a euler circuit
		}
		return 1; //if graph contain euler path
	}

}
