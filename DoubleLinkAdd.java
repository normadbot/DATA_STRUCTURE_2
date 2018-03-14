import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node next;
	Node prev;
	public Node (int data){
		this.data=data;
		this.next=null;
		this.prev=null;	
	}
}
public class DoubleLinkAdd{
	public static Node head,end,head1,head2;
		public	DoubleLinkAdd(){
			this.head=null;
			this.end=null;		
		}
		void addNode(int data){
			Node newNode= new Node(data);
			if(head==null){
				head=newNode;
				end=newNode;
				return;
			}
			if(head.next==null){
				head.next=newNode;
				end.prev=newNode;
				return;
			}
			Node Current =head;
			while(Current.next!=end){
				if(Current==end.prev){
					Current.next=newNode;
					end.prev=newNode;
					return;	
				}
				Current=Current.next;
			}
		}
		void display(Node  head){
			if(head!=null){
				System.out.print(" "+ head.data);
				display(head.next);
			}
		}
		void addNode(Node head1,Node head2){
			int size1=0,size2=0;
			if(head1==null){
				size1=0;
			}if(head2==null){
				size2=0;
			}
			if(head1.next==null){
				size1++;
			}
			if(head2.next==null){
				size2++;
			}
			Node Current1=head1;
			Node Current2=head2;
			while(head1!=null){
				if(Current1==null)break;
				Current1=Current1.next;
				size1++;
			}while(head2!=null){
				if(Current2==null)break;
				Current2=Current2.next;
				size2++;
			}
			System.out.println();
			Node C1=head1;
			Node C2=head2;
			while(C1!=null || C2!=null){
				int sum=0,c=0;
				if(C1!=null && C2==null){
					System.out.print(" "+C1.data);
					return;	
				}if(C1==null && C2!=null){
					System.out.print(" "+C2.data);
					return;	
				}	
				int d1=C1.data;
				int d2=C2.data;
				C1=C1.next;
				C2=C2.next;
				sum=d1+d2+c;
				System.out.print(" "+sum);
				
			}
			
		}
	public static void main(String [] args ){
		DoubleLinkAdd a= new DoubleLinkAdd();
		a.addNode(5);
		a.addNode(10);
		a.addNode(11);
	//	a.addNode(12);
		head1=head;
		a.display(a.head1);
		head=null;
		System.out.println();
		a.addNode(15);
		a.addNode(1);
		a.addNode(16);
		a.addNode(22);
		head2=head;
		a.display(a.head2);
		head=null;
		a.addNode(head1,head2);
		
		
		
		
	}
	
}