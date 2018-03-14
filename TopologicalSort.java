import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
class Graph{
	int v;
	LinkedList<Integer> adjmatrix[];
	Graph(int v){
		this.v=v;
		adjmatrix= new LinkedList[v];
		for(int i=0;i<v;i++){
			adjmatrix[i]= new LinkedList<>();
		}
	}
}
public class TopologicalSort{
	void addEdge(Graph graph,int src,int dest){
		graph.adjmatrix[src].add(dest);
	}
	void printGraph(Graph graph){
		for(int i=0;i<graph.v;i++){
			System.out.print("Vertex: "+i);
			System.out.println("Touching Vertex: "+graph.adjmatrix[i]);
		}
	}
	void sort(Graph graph,int v,boolean []visited,Stack<Integer> s){
		
		visited[v]=true;	
		Iterator<Integer> it= graph.adjmatrix[v].listIterator();
		while(it.hasNext()){
			int n=it.next();
			if(!visited[n]){
				visited[n]=true;
				sort(graph,n,visited,s);
			}
		}
		s.push(v);
		
	}
	void topoSort(Graph graph,int v){
		boolean visited[]= new boolean[graph.v];
		Stack<Integer> s= new Stack<Integer>();
		
		for(int i=0;i<graph.v;i++){
			if(visited[i]==false)	
				sort(graph,i,visited,s);
		}
		
		while(s.empty()==false)
			System.out.print(s.pop()+" ");
		
	}
		public static void main(String [] args){
			int V=6;
			Graph graph= new Graph(V);
			TopologicalSort a= new TopologicalSort();
			a.addEdge(graph,5,2);
			a.addEdge(graph,5,0);
			a.addEdge(graph,4,0);
			a.addEdge(graph,4,1);
			a.addEdge(graph,2,3);
			a.addEdge(graph,3,1);
			a.printGraph(graph);
			a.topoSort(graph,5);
		}
}