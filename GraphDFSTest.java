import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
import java.lang.*;
class GraphDFSTest
{
     int V;   
   
     LinkedList<Integer> adj[];

    
    GraphDFSTest(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

   
    void addEdge(int v, int w)
    {
        adj[v].add(w);  
    }

   
    void DFSUtil(int v,boolean visited[])
    {
      
        visited[v] = true;
        System.out.print(v+" ");

      
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    
    void DFS(int v)
    {
        
        boolean visited[] = new boolean[V];

     
        DFSUtil(v, visited);
    }
    void printGraph(GraphDFSTest g){
        for(int i=0;i<V;i++){

            System.out.println("Vertex :"+i+" "+adj[i]);
        }
    }
    public static void main(String args[])
    {
        GraphDFSTest g = new GraphDFSTest(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
        g.printGraph(g);
        g.DFS(3);
    }
}