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
public class CreateSpecialTreefrmPreorder{
		static int preIndex=0;
		void inorder(Node root){
			if(root!=null){
				inorder(root.left);
				System.out.print(root.data+" ");
				inorder(root.right);
			}
		}
		Node formTree(int pre[],char preLN[]){
			int preElement=pre[preIndex];
			Node newNode= new Node(preElement);
			if(preLN[preIndex]=='L'){
				preIndex++;
				return newNode;
			}
			preIndex++;
			newNode.left=formTree(pre,preLN);
			newNode.right=formTree(pre,preLN);
			
			return newNode;
		}
		public static void main(String [] args){
			CreateSpecialTreefrmPreorder a = new CreateSpecialTreefrmPreorder();
			int pre[]={10,30,20,5,15};
			char preLN[]={'N','N','L','L','L'};
			Node r=a.formTree(pre,preLN);
			a.inorder(r);
		}
}