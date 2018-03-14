import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class SortedArraytoBST{
		void inorder(Node root){
				if(root!=null){
					System.out.print(root.data+" ");
					inorder(root.left);
					inorder(root.right);
				}
		}
		Node formBst(int a[],int s,int e){
			if(s>e)return null;
			int mid=(s+e)/2;
			Node newNode= new Node(a[mid]);
			
			newNode.left=formBst(a,s,mid-1);
			newNode.right=formBst(a,mid+1,e);
			
			return newNode;
		}
		public static  void main(String [] args){
			SortedArraytoBST a = new SortedArraytoBST();
			int b[]={1,2,3,4,5,6,7};
			Node r=a.formBst(b,0,b.length-1);
			a.inorder(r);
		}
}