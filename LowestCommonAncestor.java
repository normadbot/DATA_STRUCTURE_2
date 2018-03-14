import java.lang.*;
import java.util.*;
class Node {
	int data;
	Node right,left;
	Node (int data){
		this.data=data;	
		this.left=null;
		this.right=null;
	}
}
public class LowestCommonAncestor{
	Node root;
	public	LowestCommonAncestor(){
		this.root=null;
	}
	int lca(int d1,int d2){
		while(root!=null){
			if(root.data<d1 && root.data<d2){
				root=root.right;
			}else if(root.data>d1 && root.data>d2){
				root=root.left;
			}
			else
			break;
		}
		return root.data;
	}
	public static void main(String []args){
		LowestCommonAncestor lc = new LowestCommonAncestor();
		lc.root =new Node(20);
		lc.root.right =new Node(22);
		lc.root.left=new Node(8);
		lc.root.left.left=new Node(4);
		lc.root.left.right=new Node(12);
		lc.root.left.right.right=new Node(14);
		lc.root.left.right.left=new Node(10);
		int d=lc.lca(22,14);
		System.out.println(d);
	}
}
