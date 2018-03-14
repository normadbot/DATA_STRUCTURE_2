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
public class PostOrderUsingStack1{
		Node root;
		public PostOrderUsingStack1(){
			this.root=null;
		}
		
	
	void postorder1(Node root){
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		Node c=root;
		s1.push(root);
		while(c!=null && (!s1.isEmpty())){
			Node t=s1.pop();
			s2.push(t);
			if(t.left!=null){
				s1.push(t.left);
			}if(t.right!=null){
				s1.push(t.right);
			}
		}
		while(!s2.isEmpty()){
			System.out.print(s2.pop().data+" ");
		}
	}
	
		void postorder3(Node root){
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
		public static void main(String [] args){
			PostOrderUsingStack1 a = new PostOrderUsingStack1();
			a.root= new Node(1);
			a.root.left= new Node(2);
			a.root.right= new Node(3);
			a.root.left.left=new Node(4);
			a.root.left.right=new Node(5);
			a.root.right.right=new Node(7);
			a.root.right.left=new Node(6);
			
			//a.postorder1(a.root);
			a.postorder3(a.root);
		}
}