import java.lang.*;
import java.util.*;
import java.util.LinkedList;
 class Graph{
	int v;
	LinkedList<Integer> adjMatrix[];
	Graph(int v){
		this.v=v;
		adjMatrix=new LinkedList[v];
		for(int i=0;i<v;i++){
			adjMatrix[i]=new LinkedList<>();
		}
	}
}
public class GraphRepr1{
	
	static void printGraph(Graph graph){
		for(int i=0;i<graph.v;i++){
			System.out.print("Adjacent List of Vertex of "+i);
			System.out.print(graph.adjMatrix[i]);
			
			System.out.println();
			System.out.println();
		}
	}
	static void addEdge(Graph graph,int src,int dest){
		graph.adjMatrix[src].addFirst(dest);
		graph.adjMatrix[dest].addFirst(src);
	}
	public static void main(String [] args){
		int v=5;
		Graph g= new Graph(v);
		addEdge(g,0,1);
		addEdge(g,0,4);
		addEdge(g,1,2);
		addEdge(g,1,3);
		addEdge(g,1,4);
		addEdge(g,2,3);
		addEdge(g,3,4);	
		printGraph(g);
		
	}
}