import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Node {
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class MergeSortedList{
		Node head1,head2,head3;
		public MergeSortedList(){
			this.head1=null;
			this.head2=null;
			this.head3=null;
		}
		void display(Node head){
			if(head!=null){
				System.out.print(" "+head.data);
				display(head.next);
			}
		}
		Node mergeList(Node head1,Node head2){
			Node res=null;
			if(head1==null){
				return head2;
			}
			else if(head2==null)return head1;
			if(head1.data<head2.data){
				res=head1;
				res.next=mergeList(head1.next,head2);
			}
			if(head1.data>head2.data){
				res=head2;
			res.next=mergeList(head1,head2.next);
			}
			return res;
		}
		void mergeListWithOutRecur(Node head1,Node head2){
			LinkedList lst = new LinkedList();
			while(head1!=null && head2!=null){
				if(head1.data<head2.data){
					lst.add(head1.data);
					head1=head1.next;
				}else {
					lst.add(head2.data);
					head2=head2.next;
				}
			}
			while(head1!=null){
				lst.add(head1.data);
				head1=head1.next;87
			}
			while(head2!=null){
				lst.add(head2.data);
				head2=head2.next;
			}
			//System.out.println(lst);
			 
		l1:	while(!lst.isEmpty()){
				int t=(int)lst.removeFirst();
				Node newNode= new Node(t);
				if(head3==null){
					head3=newNode;
					continue;
				}
		
				Node c=head3;	
				l2:	while(c!=null){
						if(c.next==null){		
							c.next=newNode;
							break l2;
						}
		//	System.out.println("hre1");
						c=c.next;
					}	
			//if(lst.isEmpty())break l1;
			}
			//display(head3);
		}
		public static void main(String [] args){
			MergeSortedList ml = new MergeSortedList();
			ml.head1=new Node(1);
			ml.head1.next=new Node(4);
			ml.head1.next.next=new Node(13);
			ml.head1.next.next.next=new Node(20);
			ml.head1.next.next.next.next=new Node(25);
			ml.head1.next.next.next.next.next=new Node(29);
			
			ml.head2= new Node(6);
			ml.head2.next= new Node(17);
			ml.head2.next.next= new Node(18);
			ml.head2.next.next.next= new Node(19);
			ml.head2.next.next.next.next= new Node(30);
			System.out.println();
			ml.display(ml.head1);
			System.out.println();
			ml.display(ml.head2);
			System.out.println();
	//	 Node res=	ml.mergeList(ml.head1,ml.head2);
	//	 ml.display(res);
		 ml.mergeListWithOutRecur(ml.head1,ml.head2);
		 System.out.println();
		ml.display(ml.head3);
		ml.head1=null;
		ml.head2=null;
			ml.display(ml.head2);
			ml.display(ml.head1);
		}
}