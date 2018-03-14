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
public class ConnectNodeAtSameLevel{
		Node root;
		public ConnectNodeAtSameLevel(){
			this.root=null;
		}
		int height(Node root){
			if(root==null)return 0;
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
		void connectNodeAtsameLevel(Node root){
			if(root==null)return;
			for(int i=1;i<=height(root);i++){
				connect(root,i);
				//System.out.print(a);
				connectLevel(a);
				a.clear();
			}
		}
		Queue<Node> a = new LinkedList<Node>();
		void connectLevel(Queue<Node> q){
			Node h=q.poll();
			Node h1=h;
			
			while(!q.isEmpty()){
				Node t=q.poll();
				if(h==null){
					h=t;
				}
				h.nextright=t;
				
				h=h.nextright;
				
				
			}
			System.out.println();
			display(h1);
		}
		void display(Node h){
			if(h==null){
				return;
			}
			System.out.print(h.data+" ");
			display(h.nextright);
		}
		void connect(Node root,int k){
			if(root==null){
				return;
			}
			if(k==1){
				a.add(root);
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
		public static void main(String [] args){
			ConnectNodeAtSameLevel a = new ConnectNodeAtSameLevel();	
				a.root =new Node(1);
				a.root.left =new Node(3);
				a.root.right =new Node(2);
				a.root.right.right =new Node(4);
				a.root.right.left =new Node(5);
				a.root.left.left =new Node(7);
				a.root.left.right =new Node(6);
				a.root.left.left.left =new Node(60);
				
				a.connectNodeAtsameLevel(a.root);
				System.out.println();
				System.out.println();
				System.out.println();
				a.printnextRightLevelWise(a.root);
				
			
		}
}