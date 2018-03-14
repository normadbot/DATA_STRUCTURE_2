import java.lang.*;
import java.util.*;
import java.util.ArrayList;
class Node{
	int data;
	Node left;
	Node right;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class ConstructAncestorMatrixfrmBinaryTree{
		Node root;
		public ConstructAncestorMatrixfrmBinaryTree(){
			this.root=null;
		}
		void preorder(Node root){
			if(root!=null){
				System.out.print(root.data+" ");
				preorder(root.left);
				preorder(root.right);
			}
		}
		void postorder(Node root){
			if(root!=null){
				postorder(root.left);
				postorder(root.right);
				System.out.print(root.data+" ");
			}
		}
		void printMatrix(int [][]a){
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		void formPairs(Node root,Stack<Integer> ar,int a[][]){
			if(root==null)return;
			for(int i=0;i<ar.size();i++){
				a[ar.get(i)][root.data]=1;
			}
			ar.add(root.data);
			formPairs(root.left,ar,a);
			formPairs(root.right,ar,a);
			ar.pop();
			
		}
		void formAncestorMatrix(Node root,int [][]a){
			if(root==null)return;
			Stack<Integer> ar= new Stack<Integer>();
			formPairs(root,ar,a);
			printMatrix(a);
		}
		public static void main(String [] args){
			ConstructAncestorMatrixfrmBinaryTree a = new ConstructAncestorMatrixfrmBinaryTree();
			int ar[][]=new int[6][6];
			a.root = new Node(5);
			a.root.right = new Node(2);
			a.root.right.left = new Node(3);
			a.root.left= new Node(1);
			a.root.left.left= new Node(0);
			a.root.left.right= new Node(4);
			a.preorder(a.root);
			System.out.println();
			System.out.println();
			System.out.println();
			a.formAncestorMatrix(a.root,ar);
		
		}
}