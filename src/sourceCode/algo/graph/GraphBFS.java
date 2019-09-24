package sourceCode.algo.graph;

//Java program to print BFS traversal from a given source vertex. 
//BFS(int s) traverses vertices reachable from s. 

import java.util.Iterator;
import java.util.LinkedList;

//This class represents a directed graph using adjacency list representation
public class GraphBFS
{

	// No. of vertices
	private int V; 
	// Adjacency Lists
	private LinkedList<Integer> adj[]; 

	// Constructor
	GraphBFS(int v)
	{
		this.V = v;
		this.adj = new LinkedList[v];
		
		for (int i = 0; i < v; ++i)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}

	// Function to add an edge into the graph
	void addEdge(int v, int w)
	{
		adj[v].add(w);
		//Uncomment to make in Non-Directional Graph
		adj[w].add(v);
	}

	// prints BFS traversal from a given source s
	void BFS(int s)
	{
		// Mark all the vertices as not visited (By default set as false)
		boolean visited[] = new boolean[V];

		// Create a queue for BFS
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// Mark the current node as visited and enqueue it
		visited[s] = true;
		queue.add(s);

		while (queue.size() != 0)
		{
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	// Driver method to
	public static void main(String args[])
	{
	/*	GraphBFS g = new GraphBFS(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
*/
		GraphBFS graph = new GraphBFS(6);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 4);
		graph.addEdge(1, 3);
		graph.addEdge(2, 4);
		graph.addEdge(3, 5);
		graph.addEdge(4, 5);
	
		System.out.println("Following is Breadth First Traversal "
				+ "(starting from vertex 2)");

		graph.BFS(0);
		System.out.println();
		graph.BFS(1);
		System.out.println();
		graph.BFS(2);
		System.out.println();
		graph.BFS(3);
		System.out.println();
		graph.BFS(4);
		System.out.println();
		graph.BFS(5);
		System.out.println("------");
	}
}
