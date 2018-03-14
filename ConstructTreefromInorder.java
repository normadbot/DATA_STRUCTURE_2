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
public class ConstructTreefromInorder{
	Node root;
	
	void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
	}
		public static void main(String [] args){
			ConstructTreefromInorder a = new ConstructTreefromInorder();
			int b[]={5,10,40,30,28};
			int n=b.length;
			a.root=a.buildTree(b,0,n-1,a.root);
			a.inorder(a.root);
		}
		Node buildTree(int a[],int start,int end,Node root){
			if(start>end)return null; 
			int maxElementIndex=maxelementIndex(a,start,end);
			root=new Node(a[maxElementIndex]);
			if(start==end){
				return root;
			}
			root.left=buildTree(a,start,maxElementIndex-1,root.left);
			root.right=	buildTree(a,maxElementIndex+1,end,root.right);
			
			return root;
		}
		int maxelementIndex(int a[],int start,int end){
			int max=a[0];
			int index=0;
			for(int i=start;i<=end;i++){
				if(max<a[i]){
					max=a[i];
					index=i;
				}
			}
			return index;
		}
}