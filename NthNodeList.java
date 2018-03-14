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
public class NthNodeList{
		Node head;
		public NthNodeList(){
			this.head=null;
		}
		void printNode(Node head,int n){
			int c=0;
			Node v=head;
			while(v!=null){
				if(c==n)System.out.print(v.data);
				c++;
				v=v.next;
			}
		}
		public static void main(String [] args ){
			NthNodeList nl = new NthNodeList();
				nl.head=new Node(1);	
				nl.head.next=new Node(10);	
				nl.head.next.next=new Node(16);	
				nl.head.next.next.next=new Node(18);	
				nl.head.next.next.next.next=new Node(30);	
				Scanner s = new Scanner(System.in);
				System.out.print("Enter the Index ");
				int n  =s.nextInt();
				nl.printNode(nl.head,n);
				
		}
}