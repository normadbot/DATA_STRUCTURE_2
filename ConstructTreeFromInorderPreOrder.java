import java.lang.*; 
import java.util.*;
class Node{
	int data;
	Node right;
	Node left;
	public Node(int data){
		this.data=data;
		this.left=this.right=null;
	}
}
public class ConstructTreeFromInorderPreOrder{
		Node root;
		static int preIndex=0;
		public ConstructTreeFromInorderPreOrder(){
			this.root=null;
		}
		void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
		Node formTree(int inStart,int inEnd,int []in,int []pre){
			if(inStart>inEnd ){
			//	System.out.println(preIndex+"s:"+inStart+" E:"+inEnd);//for the last condition of preorder index boundary condition
				return null;
			}
			
			int preElement=pre[preIndex++];			
			Node newNode= new Node(preElement);
			
			if(inStart==inEnd){
				return newNode;
			}
			
			int preElindexIN=0;
			for(int i=inStart;i<=inEnd;i++){
				if(in[i]==preElement){
					preElindexIN=i;
				}
			}
			
			newNode.left=formTree(inStart,preElindexIN-1,in,pre);
			newNode.right=formTree(preElindexIN+1,inEnd,in,pre);
			
			return newNode;
		}
		public static void main(String [] args){
			ConstructTreeFromInorderPreOrder a = new ConstructTreeFromInorderPreOrder();
			int in[]={4,2,5,1,6,3};
			int pre[]={1,2,4,5,3,6};
			Node r=a.formTree(0,in.length-1,in,pre);
			a.inorder(r);
		}
}