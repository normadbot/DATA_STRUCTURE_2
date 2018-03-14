import java.lang.*;
import java.util.*;
class Node {
	Node next;
	int data;
	public Node(int data ){
		this.data=data;
		next=null;
	}
}
public class SinglyLinkedList1{
	public static Node head;
	public SinglyLinkedList1(){
		this.head=null;
	}
	public void insertAtBeg(int data){
		Node newNode =new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		Node Current=head;
		if(Current!=null){
			newNode.next=head;
			head=newNode;
			return;
		}
	}
	public void insertAtPlace(int data,int databfr){
		Node newNode= new Node(data);
		if (head==null){
			head=newNode;
			return;
		}
		if(head.data==databfr){
			head.next=newNode;
			return;
		}
		Node Current= head;
		while(Current.data!=databfr){
			Current=Current.next;
			if(Current.data==databfr){
				Current.next=newNode;
				return;
			}			
		}
	}
	public void insertAtEnd(int data){
		Node newNode=new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		Node Current = head;
		while(Current.next!=null){
			Current=Current.next;
			if(Current.next==null){
				Current.next=newNode;
				return;
			}
		}
	}
	public void display(Node head){
		if(head!=null){
		System.out.println(" "+head.data);
		display(head.next);
		}	
	}
	public void getSize(){
		if(head==null){
			System.out.println("Node : 0");
			return;
		}
		int c=0;
		Node Current=head;
		while(Current!=null){
			Current=Current.next;
			c++;
		}
		System.out.println("Node : "+c);
	}
	void swap(int x,int y){
		if(x==y){
			return;
		}
		Node prevX=null;
		Node CurrX=head;
		while(CurrX!=null && CurrX.data!=x){
			prevX=CurrX;
			CurrX=CurrX.next;
		}
		Node prevY=null,CurrY=head;
		while(CurrX!=null && CurrY.data!=y){
			prevY=CurrY;
			CurrY=CurrY.next;
		}
		if(CurrX ==null || CurrY==null){
			return;
		}
		if(prevX!=null){
			prevX.next=CurrY;
		}else{
			head=CurrY;
		}
		if(prevY!=null){
			prevY.next=CurrX;
		}else{
			head=CurrX;
		}
		Node t=CurrX.next;
		CurrX.next=CurrY.next;
		CurrY.next=t;
	}
	Node add(Node data){
	Node v=head;
		if(v.next==null){
			v.next=data;
			return head;
			}
			
			return add(v.next);
		
	}
	void insertRecurEnd(int data,Node h){
		Node c=h;
		if(c==null){
			System.out.println("here");
		Node newNode = new Node(data);
			head = newNode ;
			return ;
		}if(c.next==null){
			c.next=new Node(data);
			return;
		}
	
	    else  insertRecurEnd(data,c.next); 
			
		
	}
		public static void main(String [] args){
			SinglyLinkedList1 sl = new SinglyLinkedList1();
			
		//	sl.insertAtBeg(4);
		//	sl.insertAtBeg(45);
		//	sl.insertAtBeg(40);
		//	sl.insertAtEnd(15);
		//	sl.insertAtEnd(5);
			//sl.insertAtEnd(95);
		sl.insertRecurEnd(95,sl.head);
		sl.insertRecurEnd(96,sl.head);
		sl.insertRecurEnd(97,sl.head);
		sl.insertRecurEnd(97,sl.head);
		sl.insertRecurEnd(97,sl.head);
		sl.insertRecurEnd(97,sl.head);
		sl.display(sl.head);
		//	sl.insertAtPlace(23,95);
			// sl.display(sl.head);
			// sl.getSize();
		//	sl.swap(45,40);
			// System.out.println();
			// sl.display(sl.head);
		}
}