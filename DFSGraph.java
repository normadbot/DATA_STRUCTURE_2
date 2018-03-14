import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Stack;
import java.util.LinkedList;
class Graph{
	int v;
	LinkedList<Integer> adjmatrix[];
	public Graph(int v){
		this.v=v;
		adjmatrix=new LinkedList[v];
		for(int i=0;i<v;i++){
			adjmatrix[i]=new LinkedList<>();
		}
	}
}
public class DFSGraph{
	Graph graph;
		void addEdge(Graph graph,int src,int dest){
			graph.adjmatrix[src].addFirst(dest);
			//graph.adjmatrix[dest].addFirst(src);
		}
		void PrintGrapgh(Graph graph){
			for(int i=0;i<graph.v;i++){
				System.out.print("Vertex "+i);
				System.out.print(" Touching Vertexes are: "+graph.adjmatrix[i]);
				
			System.out.println();
			}
		}
		void DFSgraph(Graph graph){
			Stack<Integer> s = new Stack<Integer>();
			Stack<Integer> q = new Stack<Integer>();
			for(int i=0;i<graph.v;i++){
				if(s.empty()){
					s.add(i);
					q.add(i);
				}
				Integer in=s.peek();
				int r=0;
				for(Integer a:graph.adjmatrix[in]){
					if(!q.contains(a)){
						q.add(a);
						s.add(a);
						r++;
						
					}
				}
				if(r==0){
					Integer pn=s.pop();
					for(Integer b : graph.adjmatrix[pn]){
						if(!q.contains(b)){
							q.add(b);
							s.add(b);
						}
					}
				}
			}
			System.out.println(s);
			System.out.println(q);
		}
		void DFSUtil(int v,boolean visited[],Graph graph){
			visited[v]=true;
			System.out.print(" "+v);
			for(Integer a:graph.adjmatrix[v]){		
				if(!visited[a]){
					DFSUtil(a,visited,graph);
				}
			}
		}
    void DFS(int v,Graph graph){
       boolean vis[]=new boolean[4];
	   DFSUtil(v,vis,graph);
    }
		public static void main(String [] args){
			int v=4;
			Graph graph = new Graph(v);
			DFSGraph g = new DFSGraph();
				g.addEdge(graph,0, 1);
				g.addEdge(graph,0, 2);
				g.addEdge(graph,1, 2);
				g.addEdge(graph,2, 0);
				g.addEdge(graph,2, 3);
				g.addEdge(graph,3, 3);
			//	g.DFSgraph(graph);
				
				g.DFS(2,graph);
			//	g.PrintGrapgh(graph);
		}
}