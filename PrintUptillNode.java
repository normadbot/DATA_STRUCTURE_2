import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class PrintUptillNode{
	Node root;
	public PrintUptillNode(){
		this.root=null;
	}
	int a[]= new int[10];
	
	void print(Node root,int d,int i){
		if(root==null){
			return;
		}
		a[i]=root.data;
		i++;
		if(root.data==d){
			for(int x=0;x<i;x++){
				System.out.print(a[x]+" ");
			}
			return;
		}else{
			print(root.left,d,i);
			print(root.right,d,i);
		}
	}
		public static void main(String [] args){
			PrintUptillNode a = new PrintUptillNode();
			a.root= new Node(15);
			a.root.left= new Node(11);
			a.root.left.right= new Node(14);
			a.root.left.left= new Node(10);
			a.root.right= new Node(19);
			a.root.right.right= new Node(20);
			a.root.right.right.right= new Node(22);
			a.root.right.right.right.right= new Node(26);
			a.root.right.left= new Node(17);
			a.root.right.left.right= new Node(18);
			
			a.print(a.root,20,0);
		}
}