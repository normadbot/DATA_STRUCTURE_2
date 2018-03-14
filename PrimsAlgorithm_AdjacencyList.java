import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.ArrayList;
class Edge<U,W>{
	U u;
	W w;
	Edge(U u,W w){
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
public class PrimsAlgorithm_AdjacencyList{
	void addEdge(Graph graph,int src,int dest,int w){
		graph.adjmatrix[src].add(new Edge(dest,w));
		graph.adjmatrix[dest].add(new Edge(src,w));
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
	void primsMST(Graph graph){
		ArrayList<Edge<Integer,Integer>> heapmap= new ArrayList<Edge<Integer,Integer>>();
		for(int i=0;i<graph.v;i++){
			if(i==0){
				heapmap.add(new Edge(i,0));
				continue;
			}
			heapmap.add(new Edge(i,Integer.MAX_VALUE));
		}
		ArrayList<Edge<Integer,Integer>> res= new ArrayList<Edge<Integer,Integer>>();
		HashMap<Integer,Edge<Integer,Integer>> table= new HashMap<Integer,Edge<Integer,Integer>>();
		while(heapmap.size()!=0){
			Edge<Integer,Integer> extractmin=extractMin(heapmap);
			Iterator<Edge<Integer,Integer>> it= graph.adjmatrix[extractmin.u].listIterator();
			while(it.hasNext()){
				Edge<Integer,Integer> n=it.next();	
				for (Edge<Integer,Integer> h: heapmap) {
					if(h.u==n.u && h.w>n.w){
						h.w=n.w;
						table.put(n.u,new Edge(extractmin.u,n.u));
					}
				}
			}
			minHeap(heapmap);
		}
		for (Edge<Integer,Integer> a: table.values()) {
			System.out.println(a.u+" "+a.w);
		}
			

	}
	Edge<Integer,Integer> extractMin(ArrayList<Edge<Integer,Integer>> a){
		Edge<Integer,Integer> r=a.get(0);
		a.remove(0);
		return r;
	}
	void minHeap(ArrayList<Edge<Integer,Integer>> a){
		int n=a.size();
		for(int i=n/2;i>=0;i--){
			minHeapify(a,i,n);
		}
	}
	void minHeapify(ArrayList<Edge<Integer,Integer>> a,int i,int n){
		int l=2*i;
		int r=2*i+1;
		int smallest=i;
		if(l<n && a.get(i).w>a.get(l).w){
			smallest=l;
		}
		if(r<n && a.get(smallest).w>a.get(r).w){
			smallest=r;
		}
		if(smallest!=i){
			Collections.swap(a,i,smallest);
			minHeapify(a,smallest,n);
		}
	}
	public static void main(String [] args){
		int V=9;
		Graph g= new Graph(V);
		PrimsAlgorithm_AdjacencyList a= new PrimsAlgorithm_AdjacencyList();
	//	a.addEdge(g,0,3,1);
	//	a.addEdge(g,0,1,3);
	//	a.addEdge(g,1,2,1);
	//	a.addEdge(g,1,3,3);
	//	a.addEdge(g,2,3,1);
	//	a.addEdge(g,2,4,5);
	//	a.addEdge(g,2,5,4);
	//	a.addEdge(g,5,4,2);
	//	a.addEdge(g,4,3,6);
		a.printGraph(g);
		System.out.println();
		a.addEdge(g, 0, 1, 4);
	    a.addEdge(g, 0, 7, 8);
	    a.addEdge(g, 1, 2, 8);
	    a.addEdge(g, 1, 7, 11);
	    a.addEdge(g, 2, 3, 7);
	    a.addEdge(g, 2, 8, 2);
	   	a.addEdge(g, 2, 5, 4);
	    a.addEdge(g, 3, 4, 9);
	    a.addEdge(g, 3, 5, 14);
	    a.addEdge(g, 4, 5, 10);
	    a.addEdge(g, 5, 6, 2);
	    a.addEdge(g, 6, 7, 1);
	   	a.addEdge(g, 6, 8, 6);
	    a.addEdge(g, 7, 8, 7);
		System.out.println();
		a.primsMST(g);
	}
}