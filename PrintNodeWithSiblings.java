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
public class PrintNodeWithSiblings{
		Node root;
		public PrintNodeWithSiblings(){
			this.root=null;
		}
		void printNodeWithSiblings(Node root){
			if(root==null)return;
			
			if(root.left!=null && root.right!=null){
				System.out.print(root.data+" ");
			}
				printNodeWithSiblings(root.left);
				printNodeWithSiblings(root.right);
			
		}
		public static void main(String [] args){
			PrintNodeWithSiblings a = new PrintNodeWithSiblings();
			
			a.root= new Node(15);
			a.root.left= new Node(11);
			a.root.left.right= new Node(14);
			a.root.left.left= new Node(10);
			a.root.right= new Node(19);
			a.root.right.right= new Node(20);
			a.root.right.right.right= new Node(22);
			a.root.right.right.right.right= new Node(26);
			a.root.right.left= new Node(17);
			a.root.right.left.right= new Node(18);
			
			a.printNodeWithSiblings(a.root);
		}
}