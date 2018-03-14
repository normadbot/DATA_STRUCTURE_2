import java.lang.*;
import java.util.*;
class Node {
	public Node next;
	int data;
	public Node(int data){
		this.data=data;
		next=null;
	}
	
}
public class Stack1{
	public static Node head;
	public Stack1(){
		this.head=null;
	}
	public void push(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			return;	
		}
		Node Current=head;
		while(Current!=null){
			if(Current!=null){
				Current=newNode;
				Current.next=head;
				head=Current;
				return;
			}
		}	
	}
	public void pop(){
		Node Current=head;
		if(Current==null){
			head.data=0;
			return;
		}
		Current=head.next;
		head=Current;
		return;
	}
	
	public void display( Node head){
		if(head!=null){
			System.out.print(" "+head.data);
			display(head.next);
		}
	}
	public int size(Node head){
		if(head==null){
			return 0;
		}
		return (1+size(head.next));
		
	}
		public static void main(String [] args ){
				Stack1 stck = new Stack1();
				stck.push(10);
				stck.push(15);
				stck.push(30);
				stck.push(40);
				stck.push(50);
				stck.push(60);
				stck.display(stck.head);
				stck.pop();
				System.out.println();
				stck.display(stck.head);
				int si=stck.size(stck.head);
				System.out.println();
				System.out.println();
				System.out.println(si);
		}
}