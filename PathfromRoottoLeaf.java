import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
class Node {
	int data;
	Node right,left;
	Node (int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class PathfromRoottoLeaf{
	Node root;
	public	PathfromRoottoLeaf(){
		this.root=null;
	}
	void printpathefromroot(Node root){
		int path[]=new int[1000];
		print(root,path,0);
	}
	void print(Node root, int a[],int path){
		if(root==null)return;
		a[path]=root.data;
		path++;
		if(root.left==null && root.right==null){
			printArray(a,path);
		}else{
			print(root.left,a,path);		
			print(root.right,a,path);		
		}
	}
	void printArray(int a[],int path){
		for(int i=0;i<path;i++){
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void printallLeafNodes(Node root){
			if(root==null){
				return;
			}
			if(root.left==null && root.right==null){
				System.out.println(root.data+" ");
			}
			printallLeafNodes(root.left);
			printallLeafNodes(root.right);
	}
	void printallLeafNodesStack(Node root){
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node t= q.poll(); 
			if(t.left!=null){
				q.add(t.left);
			}
			if(t.right!=null){
				q.add(t.right);
			}
			if(t.right==null && t.left==null){
				System.out.println(t.data);
			}
			
		}
	}
	void getInorderSuccessor(Node root,int d){
		if(root==null)return;
		Node c= root;
		Node p=null;
		while(c!=null && c.data==d){
			if(d<c.data){
				p=c;
				c=c.left;
			}else {
				c=c.right;
			}
			if(c.right==null){
				System.out.print(p.data);
				return;
			}
			c=c.right;
			while(c.left!=null){
				c=c.left;
			}
			System.out.print(c.data;);
		}
	}
		public static void main(String [] args){
			PathfromRoottoLeaf a = new PathfromRoottoLeaf();
			a.root=new Node(10);
			a.root.right=new Node(2);
			a.root.right.left=new Node(2);
			a.root.left=new Node(8);
			a.root.left.left=new Node(3);
			a.root.left.right=new Node(5);
			a.printpathefromroot(a.root);
		//	a.printallLeafNodes(a.root);
		//	a.printallLeafNodesStack(a.root);
			a.getInorderSuccessor(a.root,5);
		}
}