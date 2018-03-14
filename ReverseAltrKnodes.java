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
public class ReverseAltrKnodes{
		Node head;
		public ReverseAltrKnodes(){
			this.head=null;
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				display(head.next);
			}
		}
		Node reverseAltK(Node head,int k){
			if(head==null)return null;
			Node c=head;
			Node p=null;
			Node nex=null;
			int c1=0;
			int x=0;
			while(c!=null){
				Node w=p;
				while(c!=null && c1!=k){
					nex=c.next;
					c.next=p;
					p=c;
					c=nex;
					c1++;
				}
				if(x!=0){
					w.next=p;
				}
				while(c1!=0){
					--c1;
					++x;
					if(x==1){
						head=p	;
					}
					if((c1)==0){
						p.next=c;
						break;
					}
					p=p.next;
				}
				c1=k;
				while(c!=null &&c1!=0){
					--c1;
					p=c;
					c=c.next;
				}
			}
			return head;
		}
		public static void main(String [] args){
			ReverseAltrKnodes a = new ReverseAltrKnodes();
			a.head= new Node(1);
			a.head.next= new Node(2);
			a.head.next.next= new Node(3);
			a.head.next.next.next= new Node(4);
			a.head.next.next.next.next= new Node(5);
			a.head.next.next.next.next.next= new Node(6);
			a.head.next.next.next.next.next.next= new Node(7);
			a.head.next.next.next.next.next.next.next= new Node(8);
			a.head.next.next.next.next.next.next.next.next= new Node(9);
			a.head.next.next.next.next.next.next.next.next.next=new Node(10);
			a.head.next.next.next.next.next.next.next.next.next.next=new Node(11);
			a.head.next.next.next.next.next.next.next.next.next.next.next=new Node(12);
			a.display(a.head);
			System.out.println();
			int k=3;
			Node r=a.reverseAltK(a.head,k);
			a.display(r);
			
		}
}	