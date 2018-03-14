import java.lang.*;
import java.util.*;
class Node {
		int data;
		Node next,prev;
		public Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
}
public class DoublyListQuickSort{
		Node head;
		public DoublyListQuickSort(){
			this.head=null;
		}
		int getSize(Node head){
			Node current=head;
			int c=0;
			while(current!=null){
				c++;
				current=current.next;
			}
			return c;
		}
		Node getLastNode(Node head){
			Node current=head;
			while(current!=null){
				if(current.next==null)break;
				current=current.next;
			}
			return current;
		}
		void printList(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				printList(head.next);
			}
		}
		void addNode(int data){
			Node newNode= new Node(data);
			if(head==null){
				head=newNode;
				return;
			}
			Node c=head;
			while(c!=null){
				if(c.next==null){
					c.next=newNode;
					newNode.prev=c;
					return;
				}
				c=c.next;
			}
		}
		
		void quicksort(Node head,Node last){
			int pivot=head.data;
			Node i = head;
			Node j=last;
			while(i!=j && i!=null && j!=null){
			//	System.out.print("here4");
				while(i.data<pivot)i=i.next;
				while(j.data>pivot)j=j.prev;
				if(i!=j){
					//System.out.print("here3");
					int t=i.data;
					i.data=j.data;
					j.data=t;
					
					i=i.next;
					j=j.prev;
				}
			}
			if(head!=j&& j!=null && head!=null){
				///System.out.print("here1");
				quicksort(head,pivot.prev	);
			}
			if(last!=i && i!=null && last!=null){
			//	System.out.print("here2");
				quicksort(pivot.next,last);
			}
		}
		public static void main(String [] args){
			DoublyListQuickSort dql = new DoublyListQuickSort();
			dql.addNode(8);
			dql.addNode(1);
			dql.addNode(44);
			dql.addNode(14);
			dql.addNode(9);
			dql.getSize(dql.head);
			Node lastnode=dql.getLastNode(dql.head);
			//System.out.println(lastnode.data);
			dql.quicksort(dql.head,lastnode);
			dql.printList(dql.head);
			
		}
}