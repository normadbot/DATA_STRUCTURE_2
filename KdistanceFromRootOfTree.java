import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.right=this.left=null;
	}
}
public class KdistanceFromRootOfTree{
	Node root;
	public KdistanceFromRootOfTree(){
		this.root=null;
	}
	static void printAt(Node root,int k){
		if(root==null)return;
		if(k==0){
			System.out.print(root.data+ " ");
			return;
		}else{
			printAt(root.left,k-1);
			printAt(root.right,k-1);
		}
	}
	
	public static void main(String [] args){
		KdistanceFromRootOfTree a= new KdistanceFromRootOfTree();
		a.root=  new Node(11);
		a.root.left=  new Node(12);
		a.root.left.right=  new Node(4);
		a.root.left.left=  new Node(25);
		a.root.right=  new Node(41);
		a.root.right.left=  new Node(7);
		a.root.right.right=  new Node(9);
		printAt(a.root,1);
	}
}