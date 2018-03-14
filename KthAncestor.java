import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class KthAncestor{
	Node root;
	public KthAncestor(){
		this.root=null;
	}
	int x=0;
	int a[]=new int[10];
	void kthancestor(Node root,int node,int k,int level,int x){
		if(root==null)return;
		a[x++]=root.data;
		if(root.data==node){
			System.out.print(a[x-k-1]+" ");
			return;
		}else{
			kthancestor(root.left,node,k,level+1,x);	
			kthancestor(root.right,node,k,level+1,x);	
		}
	}
		public static void main(String [] args){
			KthAncestor a = new KthAncestor();
			
			a.root =new Node(8);
			a.root.left =new Node(7);
			a.root.left.left =new Node(14);
			a.root.right =new Node(5);
			a.root.right.left =new Node(9);
			a.root.right.right =new Node(10);
			a.root.right.right.right =new Node(11);
			
			a.kthancestor(a.root,14,1,0,0);
		}
}