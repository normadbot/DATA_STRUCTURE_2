import java.lang.*;
import java.util.*;
class Node{
    Node next;
    int data;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MultiplyTwoNumberLinkList{
		Node head1,head2;
		public MultiplyTwoNumberLinkList(){
			this.head1=null;
			this.head2=null;
		}
		void display(Node head){
			if(head!=null){
				System.out.print(head.data+" ");
				display(head.next);
			}
		}
		Node reverse(Node head){
			Node c=head;
			Node p=null;
			Node nex=null;
			while(c!=null){
				nex=c.next;
				c.next=p;
				p=c;
				c=nex;
			}
			return p;
		}
		Node multiply(Node head1,Node head2){
			if(head1==null || head2==null)return null;
			Node c1=reverse(head1);	
			Node c2=reverse(head2);	
				
	
		}
		int mul(Node head1,Node head2){
			int num1=0;
			int num2=0;
			Node c1=head1;
			Node c2=head2;
			while(c1!=null || c2!=null){
				if(c1!=null){
					num1=num1*10+c1.data;
					c1=c1.next;
				}
				if(c2!=null){
					num2=num2*10+c2.data;
					c2=c2.next;
				}
			}
			return num1*num2;
		}
		public static void main(String [] args){
			MultiplyTwoNumberLinkList a = new MultiplyTwoNumberLinkList();
			a.head1= new Node(2);
			a.head1.next= new Node(2);
			a.head1.next.next= new Node(2);
		
			
			a.head2= new Node(3);
			a.head2.next= new Node(3);
			a.head2.next.next= new Node(2);
			a.head2.next.next.next= new Node(2);
		//  int res=a.mul(a.head1,a.head2);
		//  System.out.println(res);
			Node r=a.multiply(a.head1,a.head2);
			a.display(r);
		}
}