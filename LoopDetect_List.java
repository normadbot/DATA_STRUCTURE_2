import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class LoopDetect_List{
	Node head;
	void detectLoopAt(Node head){
		Node slow=head;
		Node fast=head;
		while(slow!=null && fast!=null && fast.next!=null){
			slow = slow.next;
			fast=fast.next.next;
			if(slow==fast){
				System.out.println("Loop detected at"+slow.data+" After removing the loop");
				slow.next=null;
				break;
			}
		}
	}
	void display(Node head){
		if(head!=null){
			System.out.print(head.data+" ");
			display(head.next);
		}
	}
		public static void main(String [] arsg){
			LoopDetect_List a = new LoopDetect_List();
			a.head = new Node(1);
			a.head.next = new Node(2);
			a.head.next.next = new Node(3);
			a.head.next.next.next = new Node(4);
			a.head.next.next.next.next = new Node(5);
			a.head.next.next.next.next.next = a.head.next;
			a.detectLoopAt(a.head);
			a.display(a.head);
		}
}
