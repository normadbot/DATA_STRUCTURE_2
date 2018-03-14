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
public class DeepestNode{
	Node root;
		public DeepestNode(){
			this.root=null;
		}
		int deepeslevel,value;
		void deepest(Node root){
			find(root,0);
			System.out.println("Value of Deepest Node is "+value);
		}
		void find(Node root,int level){
			if(root==null)return;
			find(root.left,++level);
			if(level>deepeslevel){
				System.out.println(root.data);
				System.out.println("Level"+level);
				deepeslevel=level;
				value=root.data;
			}
			find(root.right,level);
		}
		
		public static void main(String [] args){
			DeepestNode a = new DeepestNode();
			
			a.root =new Node(8);
			a.root.left =new Node(7);
			a.root.right =new Node(5);
			a.root.right.left =new Node(9);
			a.root.right.right =new Node(10);
			a.root.right.right.right =new Node(11);
			
			a.deepest(a.root);
		}
}