import java.lang.*;
import java.util.*;
import java.util.Stack;
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.right=this.left=null;
	}
}
public class DiameterOfTree{
		Node root;
		public DiameterOfTree(){
			this.root=null;
		}
		static int heightofTree(Node root){
		if(root==null)return 0;
		else{
			int l=heightofTree(root.left);
			int r=heightofTree(root.right);
			if(l>r) return (l+1);
			else return (r+1);
		}
	}
	static void diameteroftree(Node root){
		if(root==null)return;
		int dia=heightofTree(root.left)+heightofTree(root.right)+1;
		System.out.println("Diameter: "+dia);
	}
		public static void main(String [] args){
			DiameterOfTree a = new DiameterOfTree();
			a.root= new Node(1);
			a.root.left= new Node(3);
			a.root.left.left= new Node(4);
			a.root.left.right= new Node(5);
			a.root.left.right.right= new Node(2);
			a.root.left.right.left= new Node(1);
			a.root.right= new Node(2);
			a.root.right.right= new Node(7);
			a.root.right.right.right= new Node(9);
			a.root.right.right.right.left= new Node(10);
			a.root.right.right.right.right= new Node(11);
			a.root.right.right.right.right.left= new Node(12);
		
			a.diameteroftree(a.root);
		}
}