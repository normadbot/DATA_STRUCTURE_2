import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
import java.io.*;
class Graph{
	int v;
	LinkedList<Integer> adjmatrix[];
	public Graph(int v){
		this.v=v;
		adjmatrix= new LinkedList[v];
		for(int i=0;i<v;i++){
			adjmatrix[i]= new LinkedList();
		}
	}
}
public class GraphBFSTraversal{
	
	public void addEdge(Graph graph,int from ,int to){
		graph.adjmatrix[from].addFirst(to);
		graph.adjmatrix[to].addFirst(from);
		
	}
	void printGraph(Graph graph){
		for(int i=0;i<graph.v;i++){
			System.out.print("Vertex :"+i);
			System.out.println("Touching :"+graph.adjmatrix[i]);
		}
	}
	void BFSprint(int v,Graph graph){
		boolean visited[] = new boolean[graph.v];
		LinkedList<Integer> queue= new LinkedList<Integer>();
		queue.add(v);
		visited[v]=true;
		while(queue.size()!=0){
			v=queue.poll();
			System.out.print(v+" ");
			Iterator<Integer> it=graph.adjmatrix[v].listIterator();
			while(it.hasNext()){
				int i=it.next();
			
				if(!visited[i]){
					visited[i]=true;
					queue.add(i);
				}
			}
		}
	}
	public static void main(String [] args){
		int V=4;
		Graph graph= new Graph(V);
		GraphBFSTraversal g = new GraphBFSTraversal();
		g.addEdge(graph,0,1);
		g.addEdge(graph,0,2);
		g.addEdge(graph,2,0);
		g.addEdge(graph,1,2);
		g.addEdge(graph,2,3);
		g.addEdge(graph,3,3);
		g.printGraph(graph);
		g.BFSprint(3,graph);
	}
}