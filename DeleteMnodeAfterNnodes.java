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
public class DeleteMnodeAfterNnodes{
		Node head;
		public DeleteMnodeAfterNnodes(){
			this.head=null;
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+ " ");
				display(head.next);
			}
		}
		Node insert(int data){
			head=insertIN(head,data);
			return head;
		}
		Node insertIN(Node head,int d){
				if(head==null){
					head=new Node(d);
					return head;
				}
				head.next=insertIN(head.next,d);
				return head;
		}
		Node deleteMnodeAfterNnodes(Node head,int m,int n){
			if(head==null)return null;
			int m1=0,n1=0;
			Node c=head;
			Node p=head;
			while(c!=null){
				if(m1==m){
					while(n1<n){
						n1++;
					//	System.out.println("here "+c.data);
						c=c.next;
					}
					if(c!=null)
						p.next=c;
					else{
						p.next=null;
						break;
					}
					m1=0;
					n1=0;
				}
	//			System.out.println(c.data);
				m1++;
				p=c;
				c=c.next;
			}
			return head;
		}
		public static void main(String [] arsg){
			DeleteMnodeAfterNnodes a = new DeleteMnodeAfterNnodes();
			a.insert(1);
			a.insert(2);
			a.insert(3);
			a.insert(4);
			a.insert(5);
			a.insert(6);
			a.insert(7);
			a.insert(8);
			a.insert(9);
			a.display(a.head);
			System.out.println();
			int m=4;
			int n=1;
			Node h=a.deleteMnodeAfterNnodes(a.head,m,n);
			a.display(h);
		}
}