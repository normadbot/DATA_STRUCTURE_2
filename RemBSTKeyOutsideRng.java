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
public class RemBSTKeyOutsideRng{
		Node root;
		public RemBSTKeyOutsideRng(){
			this.root=null;
		}
		void inorder(Node root){
			if(root==null)return ;
			inorder(root.left);
			System.out.print(root.data+"  ");
			inorder(root.right);
		}
		int minValue(Node root)
    {
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
		Node deleteIN(Node root,int data){
		if(root==null)return root;
		if(data<root.data){
			root.left=deleteIN(root.left,data);
		}else if(data>root.data){
			root.right=deleteIN(root.right,data);
		}else{
			
			if(root.right!=null && root.left!=null){
				
				Node t= root;
			//	System.out.println("here"+t.right.data);
				
				int minfromleft=minValue(t.right);
				root.data=minfromleft;
				
				deleteIN(root.right,minfromleft);
			}
			else if(root.right!=null){
				 root=root.right;
			}else if(root.left!=null){
			//	System.out.println("here2");
				root=root.left;
			}else{
			//	System.out.println("here3");
				root=null;
			}
			}
			
			return root;
		}
		int a[]=new int[7];
		int x=0;
		void delOutofRange(Node root,int l,int h){
			
			if(root==null)return;
			if(root.data<l || root.data>h){			
				a[x++]=root.data;
			}
			delOutofRange(root.left,l,h);
			delOutofRange(root.right,l,h);
		}
		public static void main(String [] args){
			RemBSTKeyOutsideRng a = new RemBSTKeyOutsideRng();
			a.root= new Node(6);
			a.root.left= new Node(-13);
			a.root.left.right= new Node(-8);
			a.root.right= new Node(14);
			a.root.right.right= new Node(15);
			a.root.right.left= new Node(13);
			a.root.right.left.left= new Node(7);
			int l=-10;
			int h=13;
			a.inorder(a.root);
			
			a.delOutofRange(a.root,l,h);
			System.out.println(Arrays.toString(a.a));
			for(int b:a.a){
				a.root=a.deleteIN(a.root,b);
			}
			a.inorder(a.root);
		}
}