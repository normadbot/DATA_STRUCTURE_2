import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
} 
public class SuccinetOfTree{
	Node root;
	public SuccinetOfTree(){
		this.root=null;
	}
	void preorder(Node root){
		if(root==null)return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	void encode(Node root,Stack<Integer> oz,Stack<Integer> val){
		if(root==null){
			oz.push(0);
			return;
		}
		oz.push(1);
		val.push(root.data);
		encode(root.left,oz,val);
		encode(root.right,oz,val);
	}	
	Node decode(Stack<Integer> oz,Stack<Integer> val){
		if(oz.size()<=0)return null;
		Integer one=oz.pop();
		if(one==1){
			Integer v=val.pop();
			Node root= new Node(v);
			root.left=decode(oz,val);
			root.right=decode(oz,val);
		}
		return root;
	}
		public static void main(String [] args){
			SuccinetOfTree a = new SuccinetOfTree();
			Stack<Integer> oz = new Stack<Integer>();
			Stack<Integer> val = new Stack<Integer>();
			
			a.root=new Node(10);
			a.root.left=new Node(20);
			a.root.right=new Node(30);
			a.root.left.left=new Node(40);
			a.root.left.right=new Node(50);
			a.root.right.right=new Node(70);
			a.preorder(a.root);
			System.out.println();
			a.encode(a.root,oz,val);
			System.out.println(oz);
			System.out.println("Decoding Now");
			Node newRoot=a.decode(oz,val);
			a.preorder(newRoot);
		}
}