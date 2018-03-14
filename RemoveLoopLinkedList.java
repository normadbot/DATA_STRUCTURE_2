import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node next;
	boolean f= false;
	public Node(int data){
		this.data=data;
		this.next=null;
		this.f=false;
	}
}
public class RemoveLoopLinkedList{
		Node head;		
		public RemoveLoopLinkedList(){
			this.head=null;
		}
		void display(Node current){
			while(current!=null){
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
		void detectLoop(Node head){
			Node current=head;
			while(current.f==false){
				current.f=true;
				if(current.next==null){
					System.out.print("No loop found");break;
				}
				if(current.next.f==true){
					System.out.print("Loop detected End At "+current.next.data);
					break;
				}
				current=current.next;
			}
		}
		void deleteLoop(Node head){
			Node current=head;
			while(current.f==true){
				current.f=false;
				if(current.next==null){
					System.out.print("No loop to DELETE");
					break;
				}
				if(current.next.f==false){
					current.next.f=true;
					current.next=null;
					break;
				}
				current=current.next;
			}
		}
		public static void main(String [] args ){
				RemoveLoopLinkedList rl = new RemoveLoopLinkedList();
				rl.head=new Node(1);	
				rl.head.next=new Node(2);	
				rl.head.next.next=new Node(3);	
				rl.head.next.next.next=new Node(4);	
				rl.head.next.next.next.next=new Node(5);
				rl.head.next.next.next.next.next=rl.head.next;				
				rl.detectLoop(rl.head);
				System.out.println();
				System.out.println("Deleting the Loop");
				System.out.println();
				rl.deleteLoop(rl.head);
				rl.display(rl.head);
		}
}