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
public class SecondLargestElement{
	Node root;
	public SecondLargestElement(){
		this.root=null;
	}
	static void secondlargest(Node root){
		Node c= root;
		Node p=null;
		while(c.right!=null){
			p=c;
			c=c.right;
		}
		System.out.println(p.data);
	}
	static void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
		public static void main(String [] args){
			SecondLargestElement a = new SecondLargestElement();
			a.root = new Node(11);
			a.root.left = new Node(8);
			a.root.left.right = new Node(9);
			a.root.left.left = new Node(7);
			a.root.right = new Node(14);
			a.root.right.left = new Node(12);
			a.root.right.right = new Node(20);
			a.root.right.right.right = new Node(22);
			a.secondlargest(a.root);
			a.inorder(a.root);
		}
}