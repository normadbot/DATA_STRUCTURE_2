import java.lang.*;
import java.util.*;
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
public class StronglyConnectedComponents{
	Graph graph;
		void addEdge(Graph graph,int src,int dest){
			graph.adjmatrix[src].addFirst(dest);
		}
		Graph makeTranspose(Graph graph,int v){
			Graph grp= new Graph(v);
		//	System.out.println("This is Transpose: ");
			for(int i=0;i<v;i++){
				Iterator<Integer> it = graph.adjmatrix[i].listIterator();
				while(it.hasNext()){
					grp.adjmatrix[it.next()].addFirst(i);
				}
			}		
			return (grp);
		}
		void PrintGraph(Graph graph){
			for(int i=0;i<graph.v;i++){
				System.out.print("Vertex "+i);
				System.out.print(" Touching Vertexes are: "+graph.adjmatrix[i]);
				
			System.out.println();
			}
		}
		 void DFSUtil(int v,boolean visited[]){
        visited[v] = true;
        System.out.print(v + " ");
        int n;
        Iterator<Integer> i =graph.adjmatrix[v].iterator();
        while (i.hasNext()){
            n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }
		void fillOrder(Graph graph,int v ,boolean visited[],Stack stck){
			visited[v]=true;
			System.out.println(v);
			Iterator<Integer> i = graph.adjmatrix[v].listIterator();
			while(i.hasNext()){
				int n=i.next();
				if(!visited[n]){
					fillOrder(graph,n,visited,stck);
				}
			}
			stck.push(new Integer(v));
		}
		void getStronglyConnectedComponents(Graph g){
			Stack stack = new Stack();
			
			boolean visited[] = new boolean[5];
			for(int i = 0; i <5; i++){
				visited[i] = false;
			}
			for(int i=0;i<5;i++){
				if(visited[i]==false){
					fillOrder(graph,i,visited,stack);
				}
			}
			Graph gr =makeTranspose(graph,graph.v);
			
			for (int i = 0; i <5; i++){
				visited[i] = false;
			}
			while (stack.empty() == false){
            int v = (int)stack.pop();
            if (visited[v] == false){
                DFSUtil(v, visited);
                System.out.println();
            }
        } 
		}
		public static void main(String [] args){
			int v=5;
			Graph g= new Graph(v);
			StronglyConnectedComponents a = new StronglyConnectedComponents();
			a.addEdge(g,0,2);
			a.addEdge(g,1,0);
			a.addEdge(g,2,1);
			a.addEdge(g,0,3);
			a.addEdge(g,3,4);
		//	a.PrintGraph(g);
			Graph tg=a.makeTranspose(g,v);
		//	a.PrintGraph(tg);
			a.getStronglyConnectedComponents(g);
			
		}
}