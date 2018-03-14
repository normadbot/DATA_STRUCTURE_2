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
public class InsertOneToListNumber{
	Node head;
		public InsertOneToListNumber(){
			this.head=null;
		}
		void display(Node head){
			if(head==null)return;
			System.out.print(head.data);
			display(head.next);
		}
		int findLenList(Node head){
			int c=0;
			Node cen=head;
			while(cen!=null){
				c++;
				cen=cen.next;
			}
			return c;
		}
		String findVal(Node head){
			Node h=head;
			String s="";
			while(h!=null){
				s+=Integer.toString(h.data);
				h=h.next;
			}
			return s;
		}
		void addNum(Node head,int num){
			if(head==null)return;
			Node c= head; 
			int numLen=findLenList(head);
			String numvalue=findVal(head);
			int sum=Integer.parseInt(numvalue)+num;
			String str=Integer.toString(sum);
			if(str.length()==numLen){
				int i=0;
				while(c!=null){
					int a=Character.getNumericValue(str.charAt(i));
					c.data=a;
					c=c.next;
					i++;
				}
				display(head);
			}else{
				int i=0;
				Node newNode=new Node(1);
				newNode.next=head;
				head=newNode;
				Node c1=head;
				while(c1!=null){
					int a =Character.getNumericValue(str.charAt(i));
					c1.data=a;
					c1=c1.next;
					i++;
				}
				display(head);
			}
		}
		public static void main(String [] args){
			InsertOneToListNumber a =new InsertOneToListNumber();
			a.head=new Node(9);
			a.head.next=new Node(9);
			a.head.next.next=new Node(9);
			int c=1;
			a.addNum(a.head,c);
		}
}