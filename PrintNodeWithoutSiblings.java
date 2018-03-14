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
public class PrintNodeWithoutSiblings{
		Node root;
		public PrintNodeWithoutSiblings(){
			this.root=null;
		}
		void printNodes(Node root){
			Node p=null;
			print(root,p);
		}
		void print(Node root,Node p){
			if(root==null)return;
			if(p!=null && ((p.left==root&&p.right==null)||(p.right==root&& p.left==null))){
				System.out.print(root.data+" ");
			}
			p=root;
			print(root.left,p);
			print(root.right,p);	
		}
		public static void main(String[] atrgs){
			PrintNodeWithoutSiblings a = new PrintNodeWithoutSiblings();
			a.root= new Node(1);
			a.root.left= new Node(2);
			a.root.left.left= new Node(4);
			a.root.left.left.left= new Node(6);
			a.root.left.right=new Node(5);
			a.root.left.right.left=new Node(7);
			a.root.right= new Node(3);
			a.root.right.right= new Node(8);
			a.root.right.right.left= new Node(9);
			
			
			a.printNodes(a.root);
		}
}