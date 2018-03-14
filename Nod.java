import java.lang.*;
import java.util.*;
 class Nod {
	private static Node root;
		public Nod(int data){
			root=new Node(data);
		}
		public void add(Node parent,Node child,String Orientation){
			if(Orientation.equals("left")){
				parent.setLeft(child);
			}else{
				parent.setRight(child);
			}
		}
		public static void main(String []args){
			Node n1=new Node(1);
			Node n2=new Node(4);	
			Node n3=new Node(2);	
			Node n4=new Node(5);	
			
			Nod tree= new Nod(3);
			tree.add(root,n1,"left");
			tree.add(root,n2,"right");
			tree.add(n2,n3,"left");
			tree.add(n2,n4,"right");
		
	}
}
class Node {
	private int key;
	private Node left;
	private Node right;

	Node(int key){
		this.key=key;
		right=null;
		left=null;
	}
		public void setKey(int key){
			this.key=key;
		}
		public int getKey(){
			return key;
		}
		public void  setLeft(Node left){
			this.left=left;
		}
		 public Node getLeft(){
			 return left;
		 }
		 public void setRight(Node right){
			 this.right=right;
		 }
		 public Node getRight(){
			 return right;
		 }
		
	
}