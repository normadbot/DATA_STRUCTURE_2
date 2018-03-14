import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
class Node {
	Node right;
	Node left;
	int data;
   public Node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
	}
}
public class TraversalsWaysAndMethods{
	Node root;
	public TraversalsWaysAndMethods(){
		this.root=null;
	}
	void inorderRECURSION(Node root){
		if(root!=null){
			inorderRECURSION(root.left);
			System.out.print(root.data+" ");
			inorderRECURSION(root.right);
		}
	}
	void preorderRECURSION(Node root){
		if(root!=null){
			System.out.print(root.data+" ");
			preorderRECURSION(root.left);
			preorderRECURSION(root.right);
		}
	}
	void postorderRECURSION(Node root){
		if(root!=null){
			postorderRECURSION(root.left);
			postorderRECURSION(root.right);
			System.out.print(root.data+" ");
		}
	}
	void inorderITERATIVE(Node root){
		Stack<Node> s = new Stack<Node>();
		
		Node c=root;
		while(c!=null){
			s.push(c);
			c=c.left;
		}
		while(s.size()>0){
			c=s.pop();
			System.out.print(c.data+" ");
			if(c.right!=null){
				c=c.right;
				while(c!=null){
					s.push(c);
					c=c.left;
				}
			}
		}
	}
	void postorderITERATIVE(Node root){
			 Stack<Node> stack = new Stack<Node>();
			stack.push(root);
 
			while(!stack.isEmpty()) {
				Node temp = stack.peek();
				if(temp.left==null && temp.right==null) {
					Node pop = stack.pop();
					System.out.print(pop.data+" ");
				}
				else {
					if(temp.right!=null) {
						stack.push(temp.right);
						temp.right = null;
					}
		 
					if(temp.left!=null) {
						stack.push(temp.left);
						temp.left = null;
					}
				}
			  }
		}
	void preorderITERATIVE(Node root){
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(!s.isEmpty()){
			Node t=s.pop();
			System.out.print(t.data+" ");
			if(t.right!=null){
				s.push(t.right);
			}if(t.left!=null){
				s.push(t.left);
			}
		}
	}
	void postorderITERATIVE1(Node root){
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while(!s.isEmpty()){
			while(root!=null){
				if(root.right!=null){
					s.push(root.right);
				}
				s.push(root);
				root=root.left;
			}
			root=s.pop();
			if(root.right!=null && root.right==s.peek()){
				Node t=s.pop();
				s.push(root);
				root=t;
			}else{
				System.out.print(root.data+" ");
				root=null;
			}
		}
	}
		public static void main(String [] args){
			TraversalsWaysAndMethods lt= new TraversalsWaysAndMethods();
				lt.root =new Node(1);
				lt.root.left =new Node(3);
				lt.root.right =new Node(2);
				lt.root.right.right =new Node(4);
				lt.root.right.left =new Node(5);
				lt.root.left.left =new Node(7);
				lt.root.left.right =new Node(6);
				
				System.out.println();
			//	lt.inorderRECURSION(lt.root);
				System.out.println();
			//	lt.preorderRECURSION(lt.root);
				System.out.println();
				lt.postorderRECURSION(lt.root);
				System.out.println();
		//		lt.inorderITERATIVE(lt.root);
				System.out.println();
			//	lt.preorderITERATIVE(lt.root);
				System.out.println();
			//	lt.postorderITERATIVE(lt.root);
				System.out.println();
				lt.postorderITERATIVE1(lt.root);
				
		}
}