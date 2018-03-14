import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Node {
	int data;
	Node right,left;
	boolean isThreaded;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class ThreadedBinaryTree{
	Node root;
	public ThreadedBinaryTree(){
			this.root=null;
	}
	void populatequeue(Node root,Queue<Node> q){
		if(root==null){
			return ;
		}
		if(root.left!=null)
			populatequeue(root.left,q);
		
			q.add(root);
			
		if(root.right!=null)
			populatequeue(root.right,q);
		
	}
	void createThreadTree(Node root,Queue<Node> q){
		if(root==null)return;
		if(root.left!=null)
			createThreadTree(root.left,q);
		
		q.remove();
		
		if(root.right!=null)
			createThreadTree(root.right,q);
		
		else{
			root.right=q.peek();
			root.isThreaded=true;
		}
	}
	void createThread(Node root){
		Queue<Node> q= new LinkedList<Node>();
		 //Store inorder in a queue//
		 populatequeue(root,q);
		 //creating the Threaded single tree//
		 createThreadTree(root,q);
	}
	Node leftMost(Node root){
		while(root!=null && root.left!=null){
			root=root.left;
		}
		return root;
	}
	void inorder(Node root){
		if(root==null)return ;
		Node cur=leftMost(root);	
		while(cur!=null){
			System.out.print("  "+cur.data+ " ");
			if(cur.isThreaded==true){
				cur=cur.right;
			}else{
				cur=leftMost(cur.right);
			}
		}
	}
	public static void main(String [] args){
		ThreadedBinaryTree lv = new ThreadedBinaryTree();
			lv.root=new Node(1);
			lv.root.left=new Node(2);
			lv.root.left.left=new Node(4);
			lv.root.left.right=new Node(5);
			lv.root.right=new Node(3);
			lv.root.right.left=new Node(6);
			lv.root.right.right=new Node(7);
			lv.root.left.right.right=new Node(8);
			lv.createThread(lv.root);
		//	lv.inorder(lv.root);
			System.out.println();
			lv.display(lv.root);
			
	}
	void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(root.data+ " ");
			display(root.right);
		}
	}
}
