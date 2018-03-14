import java.lang.*;
import java.util.*;
class Node {
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
}
public class OddEvendataList{
	Node head;
	Node head2;
	OddEvendataList(){
		this.head=null;
	}
	void display(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				display(head.next);
			}
	}
	void make(int node){
		Node newNode = new Node(node);
		Node c2=head2;
		if(head2==null){
			head2=newNode;
			return;			
		}
			while(c2!=null){
				if(c2.next==null){
					c2.next=newNode;
					return;
				}
				c2=c2.next;
			}
	}
	void delete(int node){
			Node c=head;
			if(head.data==node){
				head=head.next;
				return;
			}
			Node prev=null;
			while(c.next!=null ){
				prev=c;
				c=c.next;
				if(c.data==node ){
						prev.next=c.next;
						return;
				}
				
			}	
		}
	void differ(Node head){
		if (head==null)return;
		Node c=head;
		while(c!=null){
			if(c.data%2==0){
				make(c.data);
				delete(c.data);
			}			
			c=c.next;	
		}
		display(head);
		System.out.println();
		display(head2);
	}
	public static void main(String [] args ){
		OddEvendataList a = new OddEvendataList();
		a.head= new Node(1);
		a.head.next= new Node(2);
		a.head.next.next= new Node(3);
		a.head.next.next.next= new Node(4);
		a.head.next.next.next.next= new Node(5);
		a.head.next.next.next.next.next= new Node(6);
		a.head.next.next.next.next.next.next= new Node(7);
		a.head.next.next.next.next.next.next.next= new Node(8);
		a.head.next.next.next.next.next.next.next.next= new Node(9);
		a.differ(a.head);
		System.out.println();
		
		
		
	}
}