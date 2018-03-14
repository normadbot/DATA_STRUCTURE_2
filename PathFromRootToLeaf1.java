import java.lang.*;
import java.util.*;
class Node{
	int data;
	Node left,right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class PathFromRootToLeaf1{
			Node root;
			public PathFromRootToLeaf1(){
				this.root=null;
			}
			void inorder(Node root){
				if(root!=null){
					inorder(root.left);
					System.out.print(root.data+" ");
					inorder(root.right);
				}
			}
			public static void main(String [] args){
				PathFromRootToLeaf1 a = new PathFromRootToLeaf1();
				a.root=new Node(9);
			a.root.right=new Node(2);
			a.root.right.left=new Node(2);
			a.root.left=new Node(8);
			a.root.left.left=new Node(3);
			a.root.left.right=new Node(5);
				a.inorder(a.root);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				a.printPath(a.root);
			}
			void printArray(int a[],int k){
				for(int i=0;i<=k;i++){
					System.out.print(a[i]+" ");
				}
				System.out.println();
			}
			void printPath(Node root){
				int a[]=new int[10];
				path(root,a,0);
			}
			void path(Node root,int []a,int i){
				if(root==null)return;
				a[i]=root.data;
				if(root.left==null && root.right==null){
					printArray(a,i);
				}
				path(root.left,a,i+1);
				path(root.right,a,i+1);
			}
}