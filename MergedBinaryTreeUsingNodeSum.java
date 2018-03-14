import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class MergedBinaryTreeUsingNodeSum{
	Node root1,root2;
	public MergedBinaryTreeUsingNodeSum(){
		this.root1=null;
		this.root2=null;
	}
	void display(Node root){
		Node c=root;
		if(c!=null){
			System.out.print(" "+c.data);
			display(c.left);
			display(c.right);
		}
	}
	Node mergeNodeSum(Node root1,Node root2){
		if(root1==null){
			return root2;
		}
		if(root2==null){
			return root1;
		}
		root1.data+=root2.data;
		root1.left=mergeNodeSum(root1.left,root2.left);
		root1.right=mergeNodeSum(root1.right,root2.right);
		return root1;
	}
		public static void main(String [] args ){
				MergedBinaryTreeUsingNodeSum mb = new MergedBinaryTreeUsingNodeSum();
				mb.root1 =new Node(2);
				mb.root1.left =new Node(1);
				mb.root1.left.left =new Node(5);
				mb.root1.right =new Node(4);
				mb.display(mb.root1);
				System.out.println();
				mb.root2 =new Node(3);
				mb.root2.left =new Node(6);
				mb.root2.left.right =new Node(2);
				mb.root2.right =new Node(1);
				mb.root2.right.right =new Node(7);
				mb.display(mb.root2);
				System.out.println();
				Node root3 =mb.mergeNodeSum(mb.root1,mb.root2);
				mb.display(root3);
		}
}