import java.lang.*;
import java.util.*;
class Node {
	Node next;
	int data;
	public Node(int data){
		this.data=data;
		next=null;
	}
}
public class Queue1 {
	public static Node head;
	public Queue1(){
		this.head=null;
	}
	public void queue(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		Node Current = head;
		while(Current!=null){
			if(Current!=null){
				Current=newNode;
				Current.next=head;
				head=Current;
				return;
			}
		}
	}
	public void display(Node head){
		if(head!=null){
			System.out.print(" "+head.data);
			display(head.next);
		}
	
	}
	public void dequeue(){
		Node Current=head;
		Node lst=Current;
		while(Current.next!=null){
			lst=Current;
			Current = Current.next;	
		}
			lst.next=null;
			return;
	}
	public static void main(String [] args){
		Queue1 que= new Queue1();
		que.queue(10);
		que.queue(20);
		que.queue(30);
		que.queue(40);
		que.queue(50);
		que.queue(60);
		que.queue(70);
		que.queue(80);
		que.display(que.head);
		System.out.println();
		que.dequeue();
		que.dequeue();
		que.dequeue();
		que.display(que.head);
	}
	
}