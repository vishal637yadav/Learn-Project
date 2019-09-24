package sourceCode.algo.graph;

public class AdjacencyMatrix
{

	public static void main(String[] args)
	{
		// create the graph given in above figure
		int V = 6;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 2);
		addEdge(graph, 1, 4);
		addEdge(graph, 1, 3);
		addEdge(graph, 2, 4);
		addEdge(graph, 3, 5);
		addEdge(graph, 4, 5);
		

		// print the adjacency list representation of the above graph
		printGraph(graph);		

	}

	static class Graph
	{
		int V;
		int adjMatrixArray[][];
		
		public Graph(int V)
		{
			this.V = V;
			this.adjMatrixArray = new int[V][V];
		}
		
	}
	
	// Adds an edge to an undirected graph
	static void addEdge(Graph graph, int src, int dest)
	{
		// Add an edge from src to dest.
		graph.adjMatrixArray[src][dest] = 1;
		// Since graph is undirected, add an edge from dest to src also
		graph.adjMatrixArray[dest][src] = 1;
	}
	
	
	static void printGraph(Graph graph)
	{
		for (int i = 0; i < graph.adjMatrixArray.length; i++)
		{
			for (int j = 0; j < graph.adjMatrixArray[i].length; j++)
			{
				System.out.print(" "+graph.adjMatrixArray[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}
