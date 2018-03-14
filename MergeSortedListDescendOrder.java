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
public class MergeSortedListDescendOrder{
		Node head1,head2;
		Node head;
		public MergeSortedListDescendOrder(){
			this.head1=null;
			this.head2=null;
			this.head=null;
		}
		void addAtFirst(int data){
			Node newNode = new Node(data);
			if(head==null){
				head=newNode;
				return;
			}
			newNode.next=head;
			head=newNode;
		}
		void aggregate(Node head1,Node head2){
			if(head1==null || head2==null)return;
			Node c1=head1;
			Node c2=head2;
			while(true){
				if(c1==null && c2==null){
					break;
				}
				if(c1==null && c2!=null){
					addAtFirst(c2.data);
					c2=c2.next;
					continue;
				}
				if(c2==null && c1!=null){
					addAtFirst(c1.data);
					c1=c1.next;
					continue;
				}
				if(c1.data<c2.data && c1!=null ){
					//System.out.println(c1.data);
					addAtFirst(c1.data);
					c1=c1.next;
				}
				else if(c2.data<c1.data && c2!=null){
					//System.out.println(c2.data);
					addAtFirst(c2.data);
					c2=c2.next;
				}
				
			}
			display(head);
		}
		void display(Node head){
			if(head==null )return;
			System.out.print(head.data+" ");
			display(head.next);
		}
		public static void main(String args[]){
			MergeSortedListDescendOrder a = new MergeSortedListDescendOrder();
			a.head1=new Node(1);
			a.head1.next=new Node(2);
			a.head1.next.next=new Node(3);
			a.head1.next.next.next=new Node(4);
			a.head1.next.next.next.next=new Node(5);
			
			a.head2=new Node(6);
			a.head2.next=new Node(7);
			a.head2.next.next=new Node(8);
			a.head2.next.next.next=new Node(9);
			
			a.aggregate(a.head1,a.head2);
			
		}
}
