import java.lang.*;
import java.util.*;
class Node {
	int power;
	int data;
	Node next;
	public Node(int p,int d){
		this.power=p;
		this.data=d;
		next=null;
	}
}
public class PolynomialAdd1{
		public static Node head,head1,head2;
		PolynomialAdd1(){
			this.head=null;		
		}
		void crNode(int p,int d){
			Node newNode= new Node(p,d);
			if(head==null){
				head=newNode;
				return;
			}
			if(head.next==null){
				head.next=newNode;
				return;
			}
			Node Current = head;
			while(Current.next!=null){
				Current= Current.next;
				if(Current.next==null){
					Current.next=newNode;
					return;
				}
			}
			
		}
		void display(Node head){
			if(head!=null){
				System.out.print(" "+head.data+"x^"+head.power);
				display(head.next);
			}
		}
		void add(Node head1,Node head2){
			Node C1=head1;
			Node C2=head2;
			Node Start;
			Node C3;
			int sum=0;
			int p=0;
			int raise1= C1.power;
			int raise2= C2.power;
			if(raise1 > raise2){
				Start=head1;
				C3=head2;
			}else{
				Start=head2;
				C3=head1;
			}
			int sp=0;
			while(Start!=null){
				sp=Start.power;
				while(C3!=null){
					if(C3.power!=Start.power){
						sum=Start.data;
						p=Start.power;
						break;
					}
					if(C3.power==sp){
						sum=C3.data+Start.data;
						p=C3.power;
						C3=C3.next;
						break;
					}
				}
				Start=Start.next;
				System.out.print(" "+sum+"x^"+p);
			}
		}
		public static void main(String []args){
			PolynomialAdd1 p = new PolynomialAdd1();
			p.crNode(4,6);
			p.crNode(3,6);
			p.crNode(2,5);
			p.crNode(1,4);
			p.crNode(0,3);
			head1=head;
			p.display(p.head1);
			System.out.println();
			head=null;
			p.crNode(2,8);
			p.crNode(1,5);
			p.crNode(0,2);
			head2=head;
			p.display(p.head2);
			System.out.println();
			System.out.println();
			System.out.println();
			p.add(head1,head2);
		}
}