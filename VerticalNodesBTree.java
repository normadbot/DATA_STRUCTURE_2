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
public class VerticalNodesBTree{
	Node root;
	public VerticalNodesBTree(){
		this.root=null;
	}
	int max=0,min=0;
	void findMinMax(Node root,int horizdist){  /// finding the minimum distance from the  root i.e. left side is negative and right side is positive//
		if(root==null)return;
		if(horizdist>max){
			max=horizdist;
		}else if(horizdist<min){
			min=horizdist;
		}
		findMinMax(root.left,horizdist-1);
		findMinMax(root.right,horizdist+1);
		
	}
	void VerticalPrint(Node root){
		if(root==null) return;
		findMinMax(root,0);
		for(int i=min;i<=max;i++){
			printVerticalLine(root,i,0);
			System.out.println();
		}
	}
	void printVerticalLine(Node root,int line_dist,int horizdist){
		if(root==null)return;
		if(horizdist==line_dist){
			System.out.print(root.data+" ");
		}
			printVerticalLine(root.left,line_dist,horizdist-1);
			printVerticalLine(root.right,line_dist,horizdist+1);
		
	}
		public static void main(String [] args){
			VerticalNodesBTree a = new VerticalNodesBTree();
			
			a.root =new Node(8);
			a.root.left =new Node(7);
			a.root.left.left =new Node(14);
			a.root.left.right =new Node(16);
			a.root.right =new Node(5);
			a.root.right.left =new Node(9);
			a.root.right.right =new Node(10);
			a.root.right.right.right =new Node(11);
			
			a.VerticalPrint(a.root);
		}
}