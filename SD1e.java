import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class SD1e{
		Node head;
		public SD1e(){
			this.head=null;
		}
		void insert(int data){
			Node node = new Node(data);
			if(head==null){
				head=node;
				return;
			}
			Node c=head;
			while(c!=null){
				if(c.next==null){
					c.next=node;
					return;
				}
				c=c.next;
			}
		}
		void check(Node head){
			
		}
		public static void main(String [] args){
			SD1e a = new SD1e();
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			for(int i=0;i<n;i++){
		//	System.out.print("Enter the value:");	
			int val=s.nextInt();
			a.insert(val);
			}
			a.check(a.head);
			
		}
}