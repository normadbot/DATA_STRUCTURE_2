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
public class MotherVertex{
	Graph graph;
	void addEdge(Graph g,int src,int dest){
		g.adjmatrix[src].addFirst(dest);
	}
	void printGraph(Graph g){
		for(int i=0;i<g.v;i++){
			System.out.print("The vertex on is connected to "+i);
			for(Integer a :g.adjmatrix[i]){
				System.out.print("-> "+a);
			}
			System.out.println();
		}
	}
	
	void findvertex(Graph graph,int v,Boolean vis[]){
		vis[v]=true;
		for(Integer a : graph.adjmatrix[v]){
			if(a==null || !Arrays.asList(vis).contains(null))return;
			
			findvertex(graph,a,vis);
			System.out.println(v);
		}
	}
	void motherVertex(Graph g){///naive approch//
		
		Boolean vis[]= new Boolean[g.v];
		for(int i=0;i<g.v;i++){
			findvertex(g,i,vis);
			if(!Arrays.asList(vis).contains(false) && !Arrays.asList(vis).contains(null)){
				System.out.println("value of V is "+i);
				break;
			}
		}
	}
	public static void main(String [] args){
		Graph g= new Graph(7);
		MotherVertex a = new MotherVertex();
		a.addEdge(g,0, 1);
		a.addEdge(g,0, 2);
		a.addEdge(g,1, 3);
		a.addEdge(g,4, 1);
		a.addEdge(g,6, 4);
		a.addEdge(g,5, 6);
		a.addEdge(g,5, 2);
		a.addEdge(g,6, 0);
	//	a.printGraph(g);
		a.motherVertex(g);
	}
}