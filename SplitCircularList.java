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
public class SplitCircularList{
	Node head,head1,head2;
	public SplitCircularList(){
		this.head=null;
		this.head1=null;
		this.head2=null;
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
		int length(Node head){
		if(head==null) return 0;	
			Node h=head;
			int l=0;
			do{
				h=h.next;
				l++;
			}while(h!=head);
		return l;
		}
		Node getMid(Node head){
			if(head==null)return null;
			int len=length(head)/2;
			Node h=head;
			int c=0;
			while(c!=len){
				++c;
				h=h.next;
			}
			return h;
		}
		void split(){
			Node mid=getMid(head);
			Node h=head;
			while(h.next!=mid){
				if(h.next==mid){
					head2=h.next;
					break;
				}
				h=h.next;
			}
			Node s=mid;
			head2=mid;
			do{
				if(s.next==head){
					s.next=mid;
					break;
				}
				s=s.next;
			}while(s!=head);
			h.next=head;
			head1=head;
		}
	
	public static void main(String [] rags){
		SplitCircularList a = new SplitCircularList();
			a.insertend(1);
			a.insertend(2);
			a.insertend(3);
			a.insertend(4);
			a.insertend(5);
			a.insertend(6);
			a.split();
			a.display(a.head1);
			System.out.println();
			a.display(a.head2);
	}
}