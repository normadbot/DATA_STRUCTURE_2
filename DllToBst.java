import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node next;
	Node prev;
	public Node(int data){
		this.data=data;
		this.prev=null;
		this.next=null;
	}
}
public class DllToBst{
		Node head;
		public DllToBst(){
			this.head=null;
		}
		void addNode(int data){
			Node newNode = new Node(data);
			if(head==null){
				head=newNode;
				return;
			}
			Node current=head;
			while(current!=null){
				if(current.next==null){
					current.next=newNode;
					newNode.prev=current;
					return;
				}
				current=current.next;
			}
		}
		void display(Node head){
			Node c=head;
			while(c!=null){
				System.out.print(" "+c.data);
				c=c.next;
			}
			// while(c!=head.prev){
				// System.out.print(" "+c.data);
				// c=c.prev;
			// }
		
		}
		void convertToBST(Node head){
			
		}
		public static void main(String [] args ){
			DllToBst db = new DllToBst();
			db.addNode(56);
			db.addNode(12);
			db.addNode(10);
			db.addNode(9);
			db.addNode(8);
			db.addNode(7);
			db.addNode(6);
			db.display(db.head);
			System.out.println();
			db.convertToBST(db.head);
		}
}