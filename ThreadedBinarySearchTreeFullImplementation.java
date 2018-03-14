import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Node {
	int data;
	Node right,left;
	boolean rThread;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
		this.rThread=false;	
	}
}
public class ThreadedBinarySearchTreeFullImplementation{
		Node root;
		public ThreadedBinarySearchTreeFullImplementation(){
			this.root=null;
		}
		void insert(int data){
			Node newNode= new Node(data);
			if(root==null){
				root=newNode;
				return ;
			}
			Node current=root;
			Node p=null;
			Node p1=null;
			while(true){
			p=current;
			if(current.data>data){
				p1=current;
				current=current.left;
				if(current==null ){
					p.left=newNode;
					newNode.rThread=true;
					newNode.right=p1;
					break;
				}
			}else{
				if(current.rThread==false){
					current=current.right;
					if(current==null){
						p.right=newNode;
						newNode.right=p1;
						newNode.rThread=true;
						return;
					}
			  }else{
					Node t = current.right;
                    current.right = newNode;
                    newNode.right = t;
                    newNode.rThread=true;
                    return;
			  }			  
			}
		  }
		}	
		void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.println(root.data+" "+root.rThread);
				inorder(root.right);
			}
		}
		void ThreadInorder(Node root){
			Node current=leftmost(root);
			while(current!=null){
				System.out.print(current.data+" ");
					if(current.rThread==true){
						current=current.right;
					}else{
						current=leftmost(current.right);
					}
			}
		}
		Node leftmost(Node root){
			if(root==null){
				return null;
			}else{
				while(root.left!=null){
					root=root.left;
				}
				return root;
			}
			
		}
		void delete(int data){
			if(root==null){
				return ;
			}
			Node current=root;
			Node p=null;
			Node p1=null;
			boolean isLeft=false;
			while(true){
				p=current;
				if(current.data>data){
					p1=current;
					current=current.left;
					if(current.data==data){
						isLeft=true;
						break;
					}
				}else{
					current=current.right;
					if(current.data==data){
						isLeft=false;
						break;
					}
				}
			}
			
			
		}
			public static void main(String [] args){
				ThreadedBinarySearchTreeFullImplementation a = new ThreadedBinarySearchTreeFullImplementation();
				a.insert(20);
				a.insert(10);
				a.insert(30);
				a.insert(40);
				a.insert(5);
				a.insert(16);
				a.insert(14);
				a.insert(17);
				a.insert(13); 
			//	a.inorder(a.root);
				System.out.println();
				a.ThreadInorder(a.root);
				a.delete(17);
			//	a.delete(14);
			//	a.delete(20);
				
			}
}