import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node next;
	public Node (int data){
		this.data=data;
		this.next=null;		
	}
}
public class SumREPLinkedList{
		public static Node head,head1,head2,mhead;
		public 	SumREPLinkedList(){
			this.mhead=null;
		}
		public void addNode(int data,Node heads){
			head=heads;
			Node newNode=new Node(data);
			if(head==null ){
				head=newNode;
				return;
			}
			if(head.next==null){
				head.next=newNode;
				return;
			}
			Node Current=head;
			while(Current.next!=null ){
				Current=Current.next;
				if(Current.next==null){
				Current.next=newNode;
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
		public void displayAdded(Node mhead){
			if(mhead!=null){
				System.out.print(" "+mhead.data);
				displayAdded(mhead.next);
			}
		}
		public void makeNode(int data){
			Node newNode = new Node(data);
			if(mhead==null){
				mhead=newNode;
				return;	
			}
			if(mhead.next==null){
				mhead.next=newNode;
				return;
			}
			Node Current=mhead;
			while(Current.next!=null){
				Current=Current.next;
				if(Current.next==null){
					Current.next=newNode;
					return;
				}
			}
		}
		
		public void add(Node head1,Node head2){
			if(head1==null || head==null){
				throw new IllegalStateException();
			}
			Node Current1=head1;
			Node Current2=head2;
			int c=0,sum=0;
			while(Current1!=null || Current2!=null){
				int d1=Current1.data;
				int d2=Current2.data;
				Current1=Current1.next;
				Current2=Current2.next;
				sum=d1+d2+c;
				c=0;
				if(sum>9){
					c=sum/10;
					sum=sum%10;
				}
				if(c==0){
					makeNode(sum);
					sum=0;
				}
				else{
					makeNode(c);
					makeNode(sum+c);
					sum=0;
				}
				
			}
		}
		public static void main(String [] args ){
			SumREPLinkedList srl = new SumREPLinkedList();
			head=null;
			srl.addNode(5,head);	
			srl.addNode(6,head);	
			srl.addNode(3,head);	
			srl.addNode(1,head);	
			srl.addNode(2,head);	
			head1=head;
			srl.display(srl.head1);
			System.out.println();
			head=null;
			srl.addNode(1,head);	
			srl.addNode(1,head);	
			srl.addNode(2,head);
			srl.addNode(3,head);
			srl.addNode(6,head);
			head2=head;
			srl.display(srl.head2);
			System.out.println();
			srl.add(head1,head2);
			srl.displayAdded(srl.mhead);
			
				
			
		}
}