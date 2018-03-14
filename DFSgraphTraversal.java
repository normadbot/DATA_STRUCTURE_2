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
			adjmatrix[i]=new LinkedList<>();
		}
	}
}
public class DFSgraphTraversal{
	void addEdge(Graph graph,int src,int dest){
		graph.adjmatrix[src].addFirst(dest);
		graph.adjmatrix[dest].addFirst(src);
	}
	void printGraph(Graph graph){
		for(int i=0;i<graph.v;i++){
			System.out.print("Vertex :"+i);
			System.out.println("Touching :"+graph.adjmatrix[i]);
		}
	}
	void DFS(Graph graph,boolean visit[],Stack<Integer> s){
		if(s.empty())return;
		Integer m=s.peek();
		System.out.print(m+" ");
		Iterator<Integer> it=graph.adjmatrix[m].listIterator();
		while(it.hasNext()){
			int n=it.next();
			if(!visit[n]){
				s.push(n);
				visit[n]=true;
				DFS(graph,visit,s);
			}
		}
		s.pop();
		return;
	}
	void DFSUtil(int v,Graph graph){
		boolean visit[]= new boolean[graph.v];
		Stack<Integer> s=new Stack<Integer>();
		visit[v]=true;
		s.push(v);
		DFS(graph,visit,s);
	}
		public static void main(String [] args){
			int V=4;
			Graph graph = new Graph(V);
			DFSgraphTraversal g = new DFSgraphTraversal();
			g.addEdge(graph,0,1);
			g.addEdge(graph,0,2);
			g.addEdge(graph,2,0);
			g.addEdge(graph,1,2);
			g.addEdge(graph,2,3);
			g.addEdge(graph,3,3);
			g.DFSUtil(1,graph);
		}
}