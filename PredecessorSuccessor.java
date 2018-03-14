import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left,right;
	Node (int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class PredecessorSuccessor{
		Node root;
		public PredecessorSuccessor(){
			this.root=null;
		}
		void getPredeccssorSuccessor(Node root,int d){
			if(root==null)return;
			Node c=root;
			while(c!=null && c.data!=d){
				if(c.data>d){
					c=c.left;
				}else{
					c=c.right;
				}
			}
			
		}
		public static void main(String [] args ){
			PredecessorSuccessor ps = new PredecessorSuccessor();
			ps.root = new Node(50);
			ps.root.left = new Node(30);
			ps.root.left.left = new Node(20);
			ps.root.left.right = new Node(40);
			ps.root.right = new Node(70);
			ps.root.right.left = new Node(60);
			ps.root.right.right = new Node(80);
			ps.getPredeccssorSuccessor(ps.root,40);
			
		}
}