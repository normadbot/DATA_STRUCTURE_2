import java.lang.*;
import java.util.*;
import java.util.Queue;
import java.util.LinkedList;
class Node{
	int data;
	Node left,right,nextright;
	public Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
		this.nextright=null;
	}
}
public class ConnectNodeAtSameLevel1{
		Node root;
		public ConnectNodeAtSameLevel1(){
			this.root=null;
		}
		int height(Node root){
			if(root==null){return 0;
			}
			else{
				int l=height(root.left);	
				int r=height(root.right);
				if(l>r){
					return l+1;
				}else{
					return r+1;
				}
			}
		}
		Node t=null;
		void connectNodeAt(Node root){
			if(root==null)return;
			for(int i=0;i<=height(root);i++){
				connect(root,i);
				t=null;
			}
		}
		void connect(Node root,int k){
			if(root==null){
				return;
			}
			if(k==1){
				if(t==null){
					t=root;
				}else{
					Node s=t;
					while(s!=null){
							
						if(s.nextright==null){
							s.nextright=root;
							break;
						}
						s=s.nextright;
					}
				}
			}
			connect(root.left,k-1);
			connect(root.right,k-1);
		}
		void printnextRightLevelWise(Node root){
			Node t=root;
			while(t!=null){
				Node te=t;
				while(te!=null){
					System.out.print(te.data+" ");
					te=te.nextright;
				}
				System.out.println();
				t=t.left;
			}
		}
		void checkLevelWiseWithNodes(Node head){
				if(head==null)return;
				System.out.print(head.data+" ");
				checkLevelWiseWithNodes(head.nextright);
		}
		public static void main(String [] args){
			ConnectNodeAtSameLevel1 a = new ConnectNodeAtSameLevel1();	
				a.root =new Node(1);
				a.root.left =new Node(3);
				a.root.right =new Node(2);
				a.root.right.right =new Node(4);
				a.root.right.left =new Node(5);
				a.root.left.left =new Node(7);
				a.root.left.right =new Node(6);
				a.connectNodeAt(a.root);
				System.out.println();
				System.out.println();
				System.out.println();
				a.printnextRightLevelWise(a.root);
				System.out.println();
				a.checkLevelWiseWithNodes(a.root.right.left);
			
		}
}