import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
class Edge<U,W>{
	U u;
	W w;
	public Edge(U u,W w){
		this.u=u;
		this.w=w;
	}
}
class Graph{
	int v;	
	LinkedList<Edge<Integer,Integer>> adjmatrix[];
	public Graph(int v){
		this.v=v;
		adjmatrix= new LinkedList[v];
		for(int i=0;i<v;i++){
			adjmatrix[i]=new LinkedList<Edge<Integer,Integer>>();
		}
	}
}
public class WeightedGraph_Representation{
	void addEdge(Graph graph,int src,int dest,int weight){
		graph.adjmatrix[src].add(new Edge(dest,weight));
		graph.adjmatrix[dest].add(new Edge(src,weight));
	}
	void printGraph(Graph graph){
		for(int i=0;i<graph.v;i++){
			System.out.print("V "+i+" ->");
			for (Edge<Integer,Integer> a :graph.adjmatrix[i]) {
				System.out.print("u "+a.u+" w "+a.w+" || ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		int V=7;
		Graph g= new Graph(V);
		WeightedGraph_Representation a = new WeightedGraph_Representation();
		a.addEdge(g,0,3,1);
		a.addEdge(g,0,1,3);
		a.addEdge(g,1,2,1);
		a.addEdge(g,2,3,1);
		a.addEdge(g,2,4,5);
		a.addEdge(g,2,5,4);
		a.addEdge(g,5,4,2);
		a.addEdge(g,4,3,6);
		a.printGraph(g);
	}	
}