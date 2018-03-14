import java.lang.*;
import java.util.*;
import java.util.ArrayList;
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class SortedLinkedListToBST{
		
		Node head;
		public SortedLinkedListToBST(){
			this.head=null;
			
		}
		void inorder(Node root){
			if(root!=null){
				System.out.print(root.data+" ");
				inorder(root.left);
				inorder(root.right);
			}
		}
		Node findMid(Node strt){
			Node sl=strt;
			Node fs=strt.right;
			while(fs!=null && fs.right!=null){
				sl=sl.right;
				fs=fs.right.right;
			}
			return sl;
		}
		
		Node convertToBST(Node head){
			if(head==null){
				return null;
			}else if(head.right==null){
				return new Node(head.data);
			}
			Node mid=findMid(head);
			
			Node root= new Node(mid.right.data);
			Node right= convertToBST(mid.right.right);
			
			mid.right=null;
			
			Node left= convertToBST(head);
			
			root.left=left;
			root.right=right;
			
			return root;
		}
		Node convertToBST2(Node head){
			if(head==null)return null;
			ArrayList<Integer> a = new ArrayList<Integer>();
			Node c=head;
			int s=0;
			while(c!=null){
				a.add(c.data);
				c=c.right;
				s++;
			}
			Node res=formTreefrmList(a,0,s-1);
			return res;
		}
		Node formTreefrmList(ArrayList<Integer> a,int s,int e){
			if(s>e)return null;
			int mid=(s+e)/2;
			
			Node newNode= new Node(a.get(mid));
			
			newNode.left=formTreefrmList(a,s,mid-1);
			newNode.right=formTreefrmList(a,mid+1,e);
			
			return newNode;
		}
		
		public static void main(String [] args){
			SortedLinkedListToBST a = new SortedLinkedListToBST();
			a.head= new Node(1);
			a.head.right= new Node(2);
			a.head.right.right= new Node(3);
			a.head.right.right.right= new Node(4);
			a.head.right.right.right.right= new Node(5);
			a.head.right.right.right.right.right= new Node(6);
			a.head.right.right.right.right.right.right= new Node(7);
			
			Node s=a.convertToBST2(a.head);
			a.inorder(s);
			System.out.println();
			Node r=a.convertToBST(a.head);// method changes the output and hence might not match the required output//
			a.inorder(r);
		}
}