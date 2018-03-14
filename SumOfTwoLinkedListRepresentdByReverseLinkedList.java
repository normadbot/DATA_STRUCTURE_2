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
public class SumOfTwoLinkedListRepresentdByReverseLinkedList{
			Node head1,head2,head;
			public SumOfTwoLinkedListRepresentdByReverseLinkedList(){
				this.head=null;
				this.head1=null;
				this.head2=null;
			}
			void printList(Node head){
				if(head!=null){
				System.out.print(head.data+" ");
				printList(head.next);
				}
			}
			Node addNum(Node head1,Node head2){
				Node c1=head1;
				Node c2=head2;
				String num1="";
				String num2="";
				while(c1!=null){
					num1=Integer.toString(c1.data)+num1;
					c1=c1.next;
				}
				while(c2!=null){
					num2=Integer.toString(c2.data)+num2;
					c2=c2.next;
				}
				
				int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
				String sum1=Integer.toString(sum);
				for(int i=sum1.length()-1;i>=0;i--){
					Node newNode= new Node(Character.getNumericValue(sum1.charAt(i)));
					if(head==null){
						head=newNode;
					}else{
						Node c3=head;
						while(c3!=null){
							if(c3.next==null){
								c3.next=newNode;
								break;
							}
							c3=c3.next;
						}
					}
				}
				return head;
			}
			public static void main(String [] arfgs){
				SumOfTwoLinkedListRepresentdByReverseLinkedList a = new SumOfTwoLinkedListRepresentdByReverseLinkedList();
				a.head1 = new Node(7);
				a.head1.next = new Node(5);
				a.head1.next.next = new Node(9);
				a.head1.next.next.next = new Node(9);
				a.head1.next.next.next.next = new Node(9);
				a.head2 = new Node(8);
				a.head2.next = new Node(4);
				//a.head2.next.next = new Node(2);
				Node head=a.addNum(a.head1,a.head2);
				a.printList(head);
			}
}