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
public class LevelOrderTraversalofBSTree{
	Node root;
	public LevelOrderTraversalofBSTree(){
		this.root=null;
	}
	void levelOrderDisplay(Node root){
		LinkedList<Node> q = new  LinkedList<Node>();
		q.add(root);
		System.out.println(" "+root.data);
		while(!q.isEmpty()){
			int ln=q.size();
			while(ln>0){
			Node t=q.poll();
			if(t.left!=null){
				q.add(t.left);
				System.out.print(" "+t.left.data);
			}
			if(t.right!=null){
				q.add(t.right);
				System.out.print(" "+t.right.data);
			}
			ln--;
			System.out.println();
			}
		}	
	}
	void levelOrderDisplayRecur(Node root){
		LinkedList<Node> q = new  LinkedList<Node>();
		Stack<Integer> s= new Stack<Integer>();
		q.add(root);
		while(!q.isEmpty()){
			int size=q.size();
				
			Node t=q.poll();
			if(t.left!=null){
				q.add(t.left);
			}
			if(t.right!=null){
				q.add(t.right);
			}
			s.add(t.data);
		}
			
		while(s.isEmpty()==false){
			System.out.print(s.pop()+" ");
		}
	}
	int heightofTree(Node root){
		if(root==null){
			return 0;
		}else{
			int l= heightofTree(root.left);
			int r= heightofTree(root.right);
			if(l>r){
				return (l+1);
			}else return (r+1);
		}
	}
	void levelOrderRecur(Node root){
		for(int d=1;d<=heightofTree(root);d++){
			printGivenLevel(root,d);
		}
	}
	void printGivenLevel(Node root,int lev){
		if(root==null){
			return;
		}
		if(lev==1){
			System.out.print(root.data+" ");
		}
			printGivenLevel(root.left,lev-1);
			printGivenLevel(root.right,lev-1);
		
		
	}
	void inorderIterative(Node root){
		Stack<Node> q = new  Stack<Node>();
		q.add(root);
		Node current=root;
		while(!q.isEmpty()){
			while(current!=null){
				//System.out.println("here1");
				q.add(current);
				current=current.left;
			}
			Node t=q.pop();
			System.out.print(" "+t.data);
			current=t.right;
			
			
		}
	}
	void inorderIterativeWithoutStack(Node root){//tooo dangerous
		Node current =root,pre;
		while(current!=null){
			if(current.left==null){
				System.out.print(" "+current.data);
				current=current.right;
			}else{
				pre=current.left;
				while(pre.right!=null && pre.right!=current)
					pre=pre.right;
				if(pre.right==null){
					pre.right=current;
					current=current.left;
				}else{
					pre.right=null;
					System.out.print(" "+current.data);
					current=current.right;
				}
			}
		}
	}
	void preorderWithoutRecursion(Node root){
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node t = q.poll();
			System.out.print(" "+t.data);
			if(t.left!=null){
				q.add(t.left);
			}
			if(t.right!=null){
				q.add(t.right);
			}
		}
	}
	void levelOrderReverseRecur(Node root){
		for(int i=heightofTree(root);i>=0;i--){
			printGivenLevel(root,i);
			
		}
	}
	void levelOrderDisplaySpiral(Node root){
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node t = q.poll();
			if(t.left!=null){
				q.add(t.left);
			}
			System.out.print(t.data+ " ");
			if(t.right!=null){
				q.add(t.right);
			}
		}
	}
	void levelOrderDisplaySpiralRecur(Node root){
		int h=heightofTree(root);
		boolean ltr=false;
		for(int i=0;i<=h;i++){
			printspiral(root,i,ltr);
			ltr=!ltr;
		}
	}
	void printspiral(Node root,int i,boolean chnglevl){
		if(root==null)return;
		if(i==1){
			System.out.print(root.data);
		}else if(i>1){
			if(chnglevl==false){
				printspiral(root.left,i-1,chnglevl);
				printspiral(root.right,i-1,chnglevl);
			}else{
				printspiral(root.right,i-1,chnglevl);
				printspiral(root.left,i-1,chnglevl);
			}
		}
		
	}
	void boundaryOfTree(Node root){
			if(root!=null){
				System.out.print(root.data+" ");
				printleft(root.left);
				
					printleaves(root.left);
					printleaves(root.right);
					
				printright(root.right);
			}
	}
	void printleft(Node root){
		if(root!=null){
			if(root.left!=null){
				System.out.print(root.data+" ");
				printleft(root.left);
			}else if(root.right!=null){
				System.out.print(root.data+" ");
				printleft(root.right);
			}
		}
	}
	void printright(Node root){
		if(root!=null){
			if(root.right!=null){
				printright(root.right);
				System.out.print(root.data+ " ");
			}else if(root.left!=null){
				printright(root.left);
				System.out.print(root.data+ " ");
			}
		}
	}
	void printleaves(Node root){
		if(root!=null){
				printleaves(root.left);
				if(root.left!=null && root.right!=null){
						System.out.print(root.data+ " ");					
				}
				printleaves(root.right);
			
		}
	}
	void getInorder(Node root, int d){
		Node c=root;
		Node p=null;
		while(c!=null && c.data!=d){
			if(d<c.data){
				p=c;
				c=c.left;
			}else{
				c=c.right;
			}
			if(c.right==null){
				System.out.print(p.data+" ");
				return;
			}
			c=c.left;
			while(c.left!=null){
				c=c.left;
			}
			System.out.print(c.data+ "  ");
		}
	}
	int convertToSumTree(Node root){
		if(root==null)return 0;
		int old=root.data;
		root.data=convertToSumTree(root.left)+convertToSumTree(root.right);
		return root.data+old;
		
	}
	void heightOfTreeWithoutRecur(Node root){
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(root);
		int h=0;
		while(!q.isEmpty()){
			int len=q.size();
			while(len>0){
				Node t =q.poll();
				if(t.left!=null){
					q.add(t.left);
				}
				if(t.right!=null){
					q.add(t.right);
				}
			len--;
			}
			h++;
		}
		System.out.println("Height of tree:"+h);
	}
	void inorderSuccessor(Node root,int data){
		Node c=root;
		Node p=null;
		while(c!=null && c.data!=data){
			if(c.data>data){
				p=c;
				c=c.left;
			}else{
				c=c.right;
			}
		}
		if(c==null){
			System.out.println("The Node Has No Successor");
			return;
		}
		if(c.right==null){
			System.out.print("The Successor is :"+p.data);
			return;
		}
		c=c.right;
		while(c.left!=null){
			c=c.left;
		}
		System.out.println("The Successsor is :"+c.data);
	}
	void inorderPredecessor(Node root,int data){
		Node c=root;
		Node p=null;
		while(c!=null && c.data!=data){
			if(c.data>data){
				c=c.left;
			}else{
				p=c;
				c=c.right;
			}
		}
		if(c==null){
			System.out.println("The Node Does not have a predecessor ");
			return;
		}
		if(c.left==null){
			System.out.println("The Nodes Predecessor is :"+p.data);
			return;
		}
		c=c.left;
		while(c.right!=null){
			c=c.right;
		}
		System.out.println("The Predecessor of the Node  is :"+c.data);
	}
		public static void main(String [] args){
				LevelOrderTraversalofBSTree lt = new LevelOrderTraversalofBSTree();
				lt.root =new Node(1);
				lt.root.left =new Node(3);
				lt.root.right =new Node(2);
				lt.root.right.right =new Node(4);
				lt.root.right.left =new Node(5);
				lt.root.left.left =new Node(7);
				lt.root.left.right =new Node(6);
			//	lt.levelOrderDisplay(lt.root);	
				System.out.println();
				lt.levelOrderRecur(lt.root);
				System.out.println();
			//	lt.inorderIterative(lt.root);
				System.out.println();
			//	lt.inorderIterativeWithoutStack(lt.root);
				System.out.println();
			//	lt.preorderWithoutRecursion(lt.root);
			//	lt.levelOrderReverseRecur(lt.root);
			//	lt.levelOrderDisplayRecur(lt.root);
				System.out.println();
			///    lt.levelOrderDisplaySpiral(lt.root);
				System.out.println();
			//	lt.levelOrderDisplaySpiralRecur(lt.root);
				System.out.println();
			//	lt.boundaryOfTree(lt.root);
				
			//	System.out.println(lt.heightofTree(lt.root));
			//	lt.getInorder(lt.root,5);
			//	int sumtree=lt.convertToSumTree(lt.root);
			//	System.out.println("sum tree:"+sumtree);
			//	lt.heightOfTreeWithoutRecur(lt.root);
			//	lt.inorderSuccessor(lt.root,3);
				
		}
}