import java.lang.*;
import java.util.*;
class Node {
	Node next;
	int data;
	public Node(int data){
		next=null;
		this.data=data;
	}
}
public class SortedNode1{
	public static  Node head;
	public SortedNode1(){
		this.head=null;
	}
	public void display(Node head){
			if(head!=null){
					System.out.println(" "+head.data);
					display(head.next);
			}
	}
	public void push(int datas){
		Node newNode = new Node(datas);
		if(head==null){
			head=newNode;
			return;
		}
		Node Current=head;
		Node pr=Current;
		if(head.next==null){
			if(head.data>datas){
				newNode.next=head;
				head=newNode;
				return;
			}
		}
		if(Current.next!=null){
			
			
			while(Current.data<=datas && Current.next!=null){				///100 20 50 40//20 100
				pr=Current;
				Current=Current.next;
				if(pr.data<=datas && Current.data>datas){
					pr.next=newNode;
					newNode.next=Current;
					return;	
				}	
				if(Current.next==null && Current.data<=datas){
					Current.next=newNode;
					return;
				}
			}	
	
			if(datas<head.data){
				newNode.next=head;
				head=newNode;
				return;
			}
		}
	}
	public static void main(String [] args ){
			SortedNode1 sn = new SortedNode1();
			sn.push(100);
			sn.push(20);
			sn.push(50);
			sn.push(40);
			sn.push(4);
			sn.push(55);
			sn.push(56);
			sn.push(56);
			sn.push(555);
			sn.push(1);
			sn.push(555);
			sn.display(sn.head);
			
	}
}