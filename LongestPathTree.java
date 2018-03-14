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
public class LongestPathTree{
	Node root;
	public LongestPathTree(){
		this.root=null;
	}
	int heightofTree(Node root){
		if(root==null){
			return 0;
		}else{
			int l= heightofTree(root.left);
			int r= heightofTree(root.right);
			if(l>r){
				return (l+1);
			}else return (r+1);
		}
	}
	void method1(Node root){
		int h=heightofTree(root);
		int a[]=new int[h];
		perform1(root,a,0,h);
	}
	void perform1(Node root,int a[],int index,int height){
		if(root==null)return;
		a[index]=root.data;
		index++;
		if(index==height){										
				System.out.println(Arrays.toString(a));
			return;
		}else{
			perform1(root.left,a,index,height);
			perform1(root.right,a,index,height);
		}
		
	}
		public static void main(String [] args){
			LongestPathTree a = new LongestPathTree();
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
			a.method1(a.root);
		}
}