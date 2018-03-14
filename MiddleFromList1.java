import java.lang.*;
import java.util.*;
class Node {
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
}
public class MiddleFromList1{
		Node head;
		public MiddleFromList1(){
			this.head=null;
		}
		
		void printList(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				printList(head.next);
			}
		}
		void middleElement(Node head){
			Node slowptr=head;
			Node fstptr=head;
			while(fstptr!=null && fstptr.next!=null){
				slowptr=slowptr.next;
				fstptr=fstptr.next.next;
			}
			System.out.println(" the Middle element is "+slowptr.data);
		}
			public static void main(String [] args){
				MiddleFromList1 sql =  new MiddleFromList1();
				sql.head  = new Node(14);
				sql.head.next  = new Node(4);
				sql.head.next.next  = new Node(27);
				sql.head.next.next.next  = new Node(7);
				sql.head.next.next.next.next  = new Node(1);
				//sql.head.next.next.next.next.next  = new Node(10);
				sql.printList(sql.head);
				sql.middleElement(sql.head);
			}
}