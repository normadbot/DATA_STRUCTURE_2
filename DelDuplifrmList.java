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
public class DelDuplifrmList{
	Node head;
	public DelDuplifrmList(){
		this.head=null;
	}
	Node insert(int data){
		head= insertIN(head,data);
		return head;
	}
	Node insertIN(Node head,int data){
		if(head==null){
			head = new Node(data);
			return head;
		}
			head.next=insertIN(head.next,data);
			return head;
	}
	void display(Node head){
		if(head!=null){
			System.out.print(head.data+" ");
			display(head.next);
		}
	}
	void deldup(Node head){
		while(head.next!=null){
			Node current=head.next;
				Node p=head;
			while(current!=null){
				if(current.data==head.data){
					if(current.next==null){
						current=p;
						current.next=null;
					}else{
						p.next=current.next;
						current=p.next;
					}
				}else{
					p=current;
					current=current.next;
				}
			}
			head=head.next;
		}
	}
		public static void main(String [] args){
			DelDuplifrmList a = new DelDuplifrmList();
			a.insert(2);
			a.insert(2);
			a.insert(2);
			a.insert(4);
			a.insert(4);
			a.insert(2);
			a.insert(5);
			a.insert(6);
			a.insert(4);
			a.display(a.head);
			System.out.println();
			a.deldup(a.head);
			a.display(a.head);
		}
}