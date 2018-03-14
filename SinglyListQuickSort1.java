import java.lang.*;
import java.util.*;
class Node {
		int data;
		Node next;
		public Node(int data){
			this.data=data;
		}
}
public class SinglyListQuickSort1{
		Node head;
		public SinglyListQuickSort1(){
			this.head=null
		}
		int getSize(Node head){
			Node head=current;
			int c=0;
			while(current!=null){
				c++;
				current=current.next;
			}
			return c;
		}
		Node getLastNode(Node head){
			Node head=current;
			while(current!=null){
				current=current.next;
			}
			return current;
		}
		void quicksort(Node head){
			
		}
		public static void main(String [] args){
				SinglyListQuickSort1 sql =  new SinglyListQuickSort1();
				sql.head  = new Node(14);
				sql.head.next  = new Node(4);
				sql.head.next.next  = new Node(27);
				sql.head.next.next.next  = new Node(7);
				sql.head.next.next.next.next  = new Node(1);
				sql.head.next.next.next.next.next  = new Node(10);
				int size=sql.getSize(sql.head);
				Node lastnode=sql.getLastNode(Node head);
				sql.quicksort(	);
					
		}		
}