import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class ExchangeFirstLastCircularList{
	Node head;
		public ExchangeFirstLastCircularList(){
			this.head=null;
		}
		
		void insertend(int data){
			Node newNode= new Node(data);
			if(head==null){
				head= newNode;
				return;
			}
			Node p=head;
			do{
				if(p.next==head|| p.next==null){
					p.next=newNode;
					newNode.next=head;
					return;
				}
				p=p.next;
			}while(p!=head);
		}
		public void display(Node head){
			Node p= head;
			if(head==null)return;
			do{
				System.out.print(p.data+" ");
				p=p.next;
			}while(p!=head);
		}
		void exchangeFirstandLast(){
			if(head==null)return;
			Node p= head;
			
			do{

				p=p.next;
			}while(p.next.next!=head);
			
			head=p.next;
			head.next=p.next.next;
			p.next=head;
			
			
		}
		public static void main(String [] args){
			ExchangeFirstLastCircularList a= new ExchangeFirstLastCircularList();
			a.insertend(1);
			a.insertend(2);
			a.insertend(3);
			a.insertend(4);
			a.insertend(5);
			a.display(a.head);
			a.exchangeFirstandLast();
			System.out.println();
			a.display(a.head);
		}
}