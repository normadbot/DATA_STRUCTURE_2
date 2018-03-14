import java.lang.*;
import java.util.*;
class Node{
	protected int  data;
	protected Node link;
	
	
	public Node(int d,Node l){
		link=l;
		data=d;
	}
	public Node(){
		link = null;
		data=0;
	}
	public int getData(){
		return data;
	}
	public void setData(int d){
		data=d;
	}
	public Node getLink(){
		return link;
	}
	public Node setLink(Node l){
		link=l;
	}
	
	
}
class LinkedList{
	protected Node start;
	protected Node end;
	public int size;
	public LinkedList(){
		start= null;
		end=null;
		size=0;
	}
	public boolean isEmpty(){
		return start==null;
	}
	public int getSize(){
		return size;
	}
	public void insertAtStart(int val){
		Node nptr = new Node(val,null);
		size++;
		if(start==null){
			start = nptr;
			end=start;
		}
		else{
		nptr.setLink(start);
		start=nptr;	
		}
	}
	public void insertAtEnd(int val){
		Node nptr = new Node(val,null);
		size++;
		if(start==null){
			start =nptr;
			end=start;
		}
		else{
			end.setLink(nptr);
			end=nptr;	
		}
	}
	public void insertAtPos(int val,int pos){
		Node nptr= new Node(val,null);
		Node ptr=start;
		pos=pos-1;
		for(int i=0;i<size;i++){
			if(i==pos){
				Node tmp=ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr=ptr.getLink();
		}
		size++;
	}
	public void deleteAtPos(int pos){
		if(pos==1){
			start= start.getLink();
			size--;
			return;
		}
		if(pos==size){
			Node s=start;
			Node t=start;
			while(s!=end){
				t=s;
				s=s.getLink();
			}
			end=t;
			end.setLink(null);
			size--;
			return;
			
		}
		Node ptr=start;
		pos=pos-1;
		for(int i=1;i<size-1;i++){
			if(i==pos){
				Node tmp=ptr.getLink();
				tmp=tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr=ptr.getLink();
		}
		size--;
	}
	public void display(){
		System.out.println("Singly Linked List: ");
		if(size==0){
			System.out.println("Empty");
			return;
		}
		if(start.getLink()==null){
			System.out.println(start.getData());
			return;
		}
		Node ptr=start;
		System.out.print(start.getData()+"->");
		ptr=start.getLink();
		while(ptr.getLink()!=null){
			System.out.print(ptr.getData()+"->");
			ptr=ptr.getLink();
		}
		System.out.print(ptr.getData()+"\n");		
	}
}
class SinglyLinkedList{
	public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			LinkedList list=new LinkedList();
			System.out.println("Singly Linked ListTest :");
			char ch;
			do{
				System.out.println("Singly Linked List Operation: ");
				System.out.println("1.Insert at Beginning ");
				System.out.println("2.insert at end ");
				System.out.println("3.Insert at position ");
				System.out.println("4.delete at position");
				System.out.println("5.Check Empty");
				System.out.println("6.getSize");
				int choice=s.nextInt();
				switch(choice){
					case 1:
					System.out.println("Enter Integer element to Insert");
					list.insertAtStart(s.nextInt());
					break;
					case 2:
					System.out.println("Enter Integer Element to insert ");
					list.insertAtEnd(s.nextInt());
					break;
					case 3:
					System.out.println("Enter Integer Element to Insert");
					int num=s.nextInt();
					System.out.println("Enter Position ");
					int pos=s.nextInt();
					if(pos<=1 || pos>list.getSize()){
						System.out.println("Invalid List Position");
					}
					else{
						list.insertAtPos(num,pos);
					}break;
					case 4:
					System.out.println("Enter Position");
					int p=s.nextInt();
					if(p<=1 || p>list.getSize()){
						System.out.println("Invalid List Position");
					}
					else{
						list.deleteAtPos();
					}
					break;
					case 5:
					System.out.println("Empty status ="+list.isEmpty());
					break;
					case 6:
					System.out.println("Size "+list.getSize());
					break;
					default:
					System.out.println("Wrong Entry");
					break;
				}
				list.display();
				System.out.println("Do You want to Continue(Type Y or N)");
				ch=s.nextInt().charAt(0);
				
			}while(ch=='Y'||ch=='y');
	}
}