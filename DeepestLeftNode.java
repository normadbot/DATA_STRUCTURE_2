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
public class  DeepestLeftNode{
	Node root;
	public DeepestLeftNode(){
		this.root=null;
	}
	
	int lDeepestNode,deepestLevel;
	void leftDeepestNode(Node root){
		if(root==null)return;
		find(root,0,false);
		System.out.println("The Left Deepest Node is : "+lDeepestNode);
	}
	void find(Node root ,int level,boolean left){
		if(root==null)return;
		
		find(root.left,++level,true);
		if(level>deepestLevel && left){
			deepestLevel=level;
			lDeepestNode=root.data;
		}
		find(root.right,level,false);
	}
		public static void main(String [] args){
			DeepestLeftNode a = new DeepestLeftNode();
			a.root =new Node(8);
			a.root.left =new Node(7);
			a.root.right =new Node(5);
			a.root.right.left =new Node(9);
			a.root.right.right =new Node(10);
			a.root.right.right.right =new Node(11);
			
			a.leftDeepestNode(a.root);
			
		}
}