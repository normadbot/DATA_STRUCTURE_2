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
public class LevelOfNode{
	Node root;
	public LevelOfNode(){
		this.root=null;
	}
	int deeplevel=0;
	
	void levelofNode(Node root,int n){
		print(root,0,n);
		System.out.println("The Level of "+n+" is: "+deeplevel);
		
	}
	void print(Node root,int level,int n){
		if(root==null)return;
		
			print(root.left,++level,n);
			if(level>deeplevel && root.data==n){
				deeplevel=level;
			}
			print(root.right,level,n);
		
	}
		public static void main(String [] args){
			LevelOfNode a = new LevelOfNode();
			a.root= new Node(1);
			a.root.left= new Node(2);
			a.root.right= new Node(3);
			a.root.left.left=new Node(4);
			a.root.left.right=new Node(5);
			a.root.right.right=new Node(7);
			a.root.right.left=new Node(6);
			a.levelofNode(a.root,7);
		}
}