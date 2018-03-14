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
public class SelectionSortList{
	Node head;
	public SelectionSortList(){
		this.head=null;
	}
	void display(Node head){
			if(head!=null){
				System.out.print(head.data+ " ");
				display(head.next);
			}
	}
	void swap(int x,int y){
		if(x==y)return;
		Node cx=head;
		Node px=null;
		while(cx!=null && cx.data!=x){
			px=cx;
			cx=cx.next;
		}
		Node cy=head;
		Node py=null;
		while(cy!=null && cy.data!=y){
			py=cy;
			cy=cy.next;
		}
		if(cy==cx)return;
		
		if(px!=null){
			px.next=cy;
		}else{
			head=cy;
		}
		if(py!=null){
			py.next=cx;
		}else{
			head=cx;
		}
		Node t=cx.next;
		cx.next=cy.next;
		cy.next=t;
		
	}
	void swapnum(int d1,int d2){
		int t=d1;
		d1=d2;
		d2=t;
	}
	void selectionsort(Node head){
	
		Node c1=head;
		while(c1!=null){
			Node c2=c1.next;
			while(c2!=null){
				if(c1.data>c2.data){
				//	swap(c1.data,c2.data);
					int t=c1.data;
					c1.data=c2.data;
					c2.data=t;
				}
				c2=c2.next;
			}
			c1=c1.next;
		//	c2=head.next;
		}
	}
	public static void main(String [] args){
		SelectionSortList a = new SelectionSortList();
		a.head= new Node(10);
		a.head.next= new Node(12);
		a.head.next.next= new Node(8);
		a.head.next.next.next= new Node(4);
		a.head.next.next.next.next= new Node(6);
		a.head.next.next.next.next.next= new Node(99);
		a.head.next.next.next.next.next.next= new Node(9);
		a.display(a.head);
		a.selectionsort(a.head);
		System.out.println();
		a.display(a.head);
	}
}