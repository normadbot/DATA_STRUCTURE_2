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
public class IterativeINORDERTraversal{
		Node root;
		public IterativeINORDERTraversal(){
			this.root=null;
		}
		static void printITERATIVE(Node root){
			Stack<Node> q= new Stack<Node>();
			q.add(root);
			Node current=root;
			while(!q.isEmpty()){
				while(current!=null){
					q.add(current);
					current=current.left;
				}
				Node t=q.pop();
				System.out.print(t.data+" ");
				current=t.right;
			}
		}
		static void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
		public static void main(String [] args){
			IterativeINORDERTraversal a = new IterativeINORDERTraversal();
			a.root=  new Node(10);
			a.root.left=  new Node(8);
			a.root.left.right=  new Node(9);
			a.root.left.left=  new Node(6);
			a.root.right=  new Node(15);
			a.root.right.left=  new Node(14);
			a.root.right.right=  new Node(19);
		//	a.printITERATIVE(a.root);
			System.out.println();
			a.inorder(a.root);
		}
}