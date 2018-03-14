import java.lang.*;
import java.util.*;
class Node {
	Node next;
	int data;
	int p;
	public Node(int data,int p){
		this.data=data;
		this.p=p;
		next=null;
	}
}
public class PriorityQueue1{
	public static Node head;
	public PriorityQueue1(){
		this.head=null;
	}
	public void push(int data,int pri){
		Node newNode=new Node(data,pri);
	
		if(head==null){
			head=newNode;
			return;
		}
		if(head.next==null){
			if(head.p<pri){
				head.next=newNode;
				return;
			}
		}
		Node Current=head;
		Node pr=Current;
		if(Current.next!=null){
			while(Current.p<=pri	&& Current.next!=null){
				pr=Current;
				Current=Current.next;
				if(pr.p<=pri && Current.p>pri){
					pr.next=newNode;
					newNode.next=Current;
					return;
				}
				if(Current.p<=pri && Current.next==null){
					Current.next=newNode;
					return;
				}
			}
			if(head.p>=pri){
				newNode.next=head;
				head=newNode;
				return;
			}
		}
	}
	public void display(Node head){
		if(head!=null){
		System.out.print(" "+"("+head.data+","+head.p+")");
			display(head.next);
		}
	}
		public static void main(String [] args ){
				PriorityQueue1 pq= new PriorityQueue1();
				pq.push(10,1);
				pq.push(20,2);
				pq.push(20,7);
				pq.push(30,3);
				pq.push(40,5);
				pq.push(50,6);
				pq.push(60,4);
				pq.push(60,4);
				pq.display(pq.head);	
		}
}