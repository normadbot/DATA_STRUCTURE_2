import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;
	public Node(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class SwapNodesInDLL{
		Node head;
		public SwapNodesInDLL(){
			this.head=null;
			
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+"  ");
				display(head.next);
			}
		}
		void displayP(Node head){
			if(head!=null){
				System.out.print(head.data+"  ");
				displayP(head.prev);
			}
		}
		void insert(int data){
			if(head==null){
				head=new Node(data);
				
			}else{
				Node newNode= new Node(data);
				newNode.next=head;
				head.prev=newNode;
				head=newNode;
			}
		}
		Node  swapNodes(int d1,int d2){
			if(d1==d2)return head;
			Node c1=head;
			Node  p1=null;
			while(c1!=null){
				if(c1.data==d1)break;
				p1=c1;
				c1=c1.next;
			}
			Node c2=head;
			Node p2=null;
			while(c2!=null){
				if(c2.data==d2)break;
				p2=c2;
				c2=c2.next;
			}
			if(p1==null && p2==null)return head;
			if(p1!=null){
				p1.next=c2;
				c2.prev=p1;
			}else{
				head=c2;
			}
			if(p2!=null){
				p2.next=c1;
				c1.prev=p2;
			}else{
				head=c1;
			}
			
			Node t =c2.next;
			c2.next=c1.next;
			c1.next=t;
			 
			Node s=c1.prev;
			c1.prev=c2.prev;
			c2.prev=s;
			 
			return head;
		}
		Node reverse(Node head){
			Node c=head;
			Node p=null;
			while(c!=null){
				Node t=c.next;	
				c.next=p;
				if(p!=null)p.prev=c;
				p=c;
				c=t;
			}
			p.prev=null;
			head=p;
			return head;
		}
		public static void main(String [] args){
			SwapNodesInDLL a = new SwapNodesInDLL();
			a.insert(1);
			a.insert(2);
			a.insert(3);
			a.insert(4);
			a.insert(5);
			a.insert(6);
			a.insert(7);
			a.insert(8);
			a.head=a.reverse(a.head);
			a.display(a.head);
			System.out.println();
			System.out.println();
			System.out.println();
			Node r=a.swapNodes(2,5);
			a.display(r);
			System.out.println();
			Node s=a.reverse(r);// for checking the list refrences of each Node in the list //
			System.out.println();
			a.display(s);
		}
		
		
}

