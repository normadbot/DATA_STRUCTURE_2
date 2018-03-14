import java.lang.*;
import java.util.*;
class Node {
	Node next;
	int data;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class RemAlterListAppendAtEnd{
		Node head;
		public RemAlterListAppendAtEnd(){
			this.head=null;
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+"->");
				display(head.next);
			}
		}
		void remAlterAppendAtEnd(Node odd){
			if(odd==null)return;
			Node t=odd.next;
		
			Node head2=t;
			odd.next=odd.next.next;
			System.out.println(t.data+"even ");
			System.out.println(odd.data+"odd\n");
			while(odd.next!=null && odd.next.next!=null){
				odd=odd.next;
				t.next=odd.next;
				t=t.next;
				odd.next=odd.next.next;
				if(odd.next==null){
					t.next=null;
					
				}else if(odd.next.next==null){
					t.next=null;
				}
				
			}
			odd.next=head2;
			display(head);
			System.out.println();
		//	display(head2);
		}
		public static void main(String [] args){
			RemAlterListAppendAtEnd a = new RemAlterListAppendAtEnd();
			a.head=new Node(1);
			a.head.next=new Node(2);
			a.head.next.next=new Node(3);
			a.head.next.next.next=new Node(4);
			a.head.next.next.next.next=new Node(5);
			a.head.next.next.next.next.next=new Node(6);
			a.head.next.next.next.next.next.next=new Node(7);
			a.head.next.next.next.next.next.next.next=new Node(8);
			a.display(a.head);
			System.out.println();
			System.out.println();
			System.out.println();
			a.remAlterAppendAtEnd(a.head);
			
		}
}