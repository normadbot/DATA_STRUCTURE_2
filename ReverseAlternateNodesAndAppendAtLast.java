import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class ReverseAlternateNodesAndAppendAtLast{
		Node head;
		public ReverseAlternateNodesAndAppendAtLast(){
			this.head=null;
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				display(head.next);
			}
		}
		Node formList(Node head){
			if(head==null)return null;
			Node c=head;
			Node e=head;
			Node even=null;
			Node p=null;
			while(c!=null && c.next!=null){
				Node t=c.next.next;
				e=c.next;
				c.next=t;
				if(even==null){
					even=e;
					even.next=null;
				}else{
					Node aux=e;
					aux.next=even;
					even=aux;
				}
				p=c;
				c=c.next;
				e=e.next;
			}
			p.next=even;
			System.out.println();
			return head;
		}
		public static void main(String [] args){
			ReverseAlternateNodesAndAppendAtLast a = new ReverseAlternateNodesAndAppendAtLast();
			a.head= new Node(1);
			a.head.next= new Node(2);
			a.head.next.next= new Node(3);
			a.head.next.next.next= new Node(4);
			a.head.next.next.next.next= new Node(5);
			a.head.next.next.next.next.next= new Node(6);
			a.head.next.next.next.next.next.next= new Node(7);
			a.head.next.next.next.next.next.next.next= new Node(8);
			a.head.next.next.next.next.next.next.next.next= new Node(9);
			a.head.next.next.next.next.next.next.next.next.next=new Node(10);
			a.head.next.next.next.next.next.next.next.next.next.next=new Node(11);
			a.head.next.next.next.next.next.next.next.next.next.next.next=new Node(12);
			a.display(a.head);
			System.out.println();
			Node r=a.formList(a.head);
			a.display(r);
			
		}

}