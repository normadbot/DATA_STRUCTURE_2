import java.lang.*;
import java.util.*;
import java.util.Stack;

class Node {
	int data;
	Node right,left;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class InorderOfTree{
	Node root;
	public InorderOfTree(){
			this.root=null;
	}
	void displayInorder(Node root){
			if(root!=null){
				displayInorder(root.left);
				System.out.print(root.data+" ");
				d	isplayInorder(root.right);
			}
	}
/*	void getInorderpred(Node root,int d){
	if(root!=null){	
		if(root.data==d){
			if(root.left!=null){
				Node t = root.left;
					while(t.right!=null){
						t=t.right;
					}
					System.out.println("Predecessor is :"+t.data);
			}
			if(root.right!=null){
				Node t=root.right;
				while(t.left!=null){
					t=t.left;
				}
				System.out.println("Successor is :"+t.data);
			}
		}
		else if(root.data>d){
			getInorderpred(root.left,d);
		}else if(root.data<d){
			getInorderpred(root.right,d);
		}
	  }
	}*/
	void getInorderSuccessor(Node root1 ,int d){
		Node c=root;
		Node p=null;
		while(c!=null && c.data!=d){
			if(d<c.data){
				p=c;
				c=c.left;
			}else {
				c=c.right;
			} 
		}	//System.out.println(c.data+" "+p.data);
		if(c==null){
			System.out.println("NO succ");
			return;
		}if (c.right==null){
			System.out.print(p.data);
			return;
		}
		c=c.right;
		while(c.left!=null){
			c=c.left;
		}
		System.out.print(c.data);
		
	}
	void getInorderPredecessor(Node root ,int d){
		Node c=root;
		Node p=null;
		while(c!=null && c.data!=d){
			if(d<c.data){
				c=c.left;
			}else {
				p=c;
				c=c.right;	
			} 
		}//	System.out.println(c.data+" "+p.data);
		if(c==null){
			System.out.println("NO succ");
			return;
		}if (c.left==null){
			System.out.println(p.data);
			return;
		}
		c=c.left;
		while(c.right!=null){
			c=c.right;
		}
		System.out.println(c.data);
	}
		public static void main(String [] rgs){
			InorderOfTree lv = new InorderOfTree();
			lv.root=new Node(20);
			lv.root.left=new Node(8);
			lv.root.left.left=new Node(4);
			lv.root.left.right=new Node(12);
			lv.root.right=new Node(22);
			lv.root.left.right.right=new Node(14);
			lv.root.left.right.left=new Node(10);
			lv.displayInorder(lv.root);
			System.out.println();
		//	lv.getInorderpred(lv.root,2);
		//	System.out.print("the InorderSuccessor of a Tree:");
		//	lv.getInorderSuccessor(lv.root,14);
			lv.getInorderPredecessor(lv.root,12	);
		}
}