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
public class NodesAtOddLevel{
	Node root;
	public NodesAtOddLevel(){
		this.root=null;
	}
	static int heightofTree(Node root){
		if(root==null)return 0;
		else{
			int l=heightofTree(root.left);
			int r=heightofTree(root.right);
			if(l>r) return (l+1);
			else return (r+1);
		}
	}
	static void print(Node root){
		boolean t=true;
		for(int i=0;i<=heightofTree(root);i++){
			printOdd(root,i,t);
			t=!t;
		}
	}
	static void printOdd(Node root,int k,boolean t){
		if(root==null)return ;
		if(t==false && k==1){
			System.out.print(root.data+"  ");
			return;
		}else{
			printOdd(root.left,k-1,t);
			printOdd(root.right,k-1,t);
		}
	}
		public static void main(String [] args){
			NodesAtOddLevel a = new NodesAtOddLevel();
			a.root = new Node(11);
			a.root.left = new Node(8);
			a.root.left.right = new Node(9);
			a.root.left.left = new Node(7);
			a.root.right = new Node(14);
			a.root.right.left = new Node(12);
			a.root.right.right = new Node(20);
			a.root.right.right.right = new Node(22);
			a.print(a.root);
		}
}