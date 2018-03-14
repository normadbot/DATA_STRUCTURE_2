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
public class SwapNodeLinkedList{
	Node head;
	public SwapNodeLinkedList(){
		this.head=null;
	}
	void display(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				display(head.next);
			}
	}
	void swap(int d1,int d2){
		if(d1==d2)return;
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
			if(p1==null && p2==null)return;
			if(p1!=null){
				p1.next=c2;
			}else{
				head=c2;
			}
			if(p2!=null){
				p2.next=c1;
			}else{
				head=c1;
			}
			Node t=c1.next;
			c1.next=c2.next;
			c2.next=t;
			
	}
	public static void main(String [] args){
			SwapNodeLinkedList a = new SwapNodeLinkedList();
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
			a.swap(4,5);
			a.display(a.head);
	}
}