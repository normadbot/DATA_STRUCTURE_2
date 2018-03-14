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

public class RemoveDupFromLinkedList{	
	Node head;
	 int t=0;
	 int n=size();
	 int a[]=new int[20];
	public RemoveDupFromLinkedList(){
		this.head=null;
		
	}
	void insertAtEnd(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			return;
		}
		if(head.next==null){
			head.next=newNode;
			return;
		}
		Node Current=head;
		while(Current!=null){
			if(Current.next==null){
				Current.next=newNode;
				return;
			}
			Current=Current.next;
		}
	}
	void display( Node head){
			if(head!=null){
				System.out.print(" "+head.data);
				display(head.next);
			}
	}
	void insertAtBeg(int data){
		Node newNode= new Node(data);
		if(head==null){
			head=newNode;
			return;	
		}
		newNode.next=head;
		head=newNode;
		return;
	}
	void sort (Node head){
		if(head==null){
			System.out.println("Can't be sorted as List is Empty");
			return;
		}
		int siz=size();
		Node i= head;
		Node j= head;
			while(i!=null){		
					while(j.next!=null){
						if(j.data>j.next.data){
						   int temp = j.data;
                    j.data = j.next.data;
                    j.next.data = temp;
						}
						j=j.next;
					}
					j=head;
					i=i.next;
			}			
	}
	 int size(){
		int Size=0;
		if(head==null){
			Size=0;
		}else{
		Node Current=head;
		while(Current!=null){
			Size++;
			Current=Current.next;
		   }
		}
		return Size;
	}
	/*void swap(int x,int y){
		if(x==y){
			return;
		}
		Node Cx=head;
		Node Px=null;
		while(Cx.data!=x && Cx!=null){
				Px=Cx;
				Cx=Cx.next;
		}		
		Node Cy=head;
		Node Py=null;
		while(Cy.data!=y && Cy!=null){
				Py=Cy;
				Cy=Cy.next;
		}
		if(Cx==null || Cy==null){
				return;
		}
		if(Px!=null){
			Px.next=Cy;
		}else head=Cy;
		if(Py!=null){
			Py.next=Cx;
		}else head=Cx;
		Node t=Cx.next;
		Cx.next=Cy.next;
		Cy.next=t;
	}*/
boolean check(int data){
	int f=0;
	for(int i=0;i<a.length;i++){
		if(a[i]==data){
			f++;
			break;
		}
	}
	if(f==0){
		return false;
	}else{
		return true;
	}
}
void addArray(int data){
	a[++t]=data;
}
	void removeDup(){
		Node Current=head;
		
		while(Current!=null){
			boolean var=check(Current.data);
			if(var==true){
				deleteNode(Current.data);
			}else{
				addArray(Current.data);
			}
			Current=Current.next;
		}
		
	}
	void deletehead(){
		if(head==null){
			System.out.println("The List is null so Cannot delete Node");
			return;
		}
		if(head.next==null){
			head=null;
			return;
		}else{
			Node C=head.next;
			head=C;
			return;
		}
		
	}
	void deleteEnd(){
		Node C=head;
		if(head.next==null){
			head=null;
			return;
		}	Node P=head;;
			while(C.next!=null){
					P=C;
				C=C.next;
			}
			P.next=null;	
			return;
	}
	void deleteNode(int data){
		
		if(head.data==data){
			head=head.next;
			return;
		}
		Node C=head,P=null;
		while(C!=null){
			P=C;
			if(C.next.data==data){
				if(C.next.next==null){
					P.next=null;
					return;
				}else{
					P.next=C.next.next;
					return;
				}
			}
			C=C.next;
		}
	}
	public static void main(String [] args ){
			RemoveDupFromLinkedList sl= new RemoveDupFromLinkedList();
			sl.insertAtEnd(10);
			sl.insertAtBeg(14);
			sl.insertAtBeg(11);
			sl.insertAtBeg(11);
			sl.insertAtEnd(5);
			sl.insertAtEnd(5);
			sl.insertAtEnd(2);
			sl.insertAtEnd(1);
			sl.display(sl.head);
			sl.sort(sl.head);
			System.out.println();
			System.out.println();
			sl.display(sl.head);
			//sl.swap(11,14);
			System.out.println();
			System.out.println();
			sl.removeDup();
		//	sl.deletehead();
		//	sl.deleteEnd();
		//	sl.deleteNode(14);
			sl.display(sl.head);
	}
}