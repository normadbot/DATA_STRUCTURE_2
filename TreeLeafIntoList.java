import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node right;
	Node left;
	public Node(int data){
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
public class TreeLeafIntoList{
		Node root,list;
		public TreeLeafIntoList(){
			this.root=null;
			this.list=null;
		}
		void createLeafList(Node root){
			if(root==null)return;
			if(root.left==null && root.right==null){
			//	System.out.println(root.data);
				if(list==null){
					list=root;
					return;
				}
					Node l=list;
				if(l.right==null){
					l.right=root;
					return;
				}
					while(l!=null){
						if(l.right==null){
							l.right=root;
							return;
						}
						l=l.right;
				//	System.out.println("Here");
					}
			}
			createLeafList(root.left);
			createLeafList(root.right);
		}
		void displayList(Node list){
			if(list!=null){
				System.out.print(list.data+"  ");
				displayList(list.right);
			}
		}
		public static void main(String [] args){
			TreeLeafIntoList a = new TreeLeafIntoList();
			a.root= new Node(10);
			a.root.left=new Node(20);
			a.root.left.left=new Node(30);
			a.root.left.right=new Node(40);
			a.root.right= new Node(100);
			a.root.right.left= new Node(9);
			a.root.right.right= new Node(66);
			a.createLeafList(a.root);
			a.displayList(a.list);
		}
}
