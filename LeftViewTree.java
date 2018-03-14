import java.lang.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
class Node {
	Node right;
	Node left;
	int data;
   public Node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
	}
}
public class LeftViewTree{
		Node root;
		LeftViewTree(){
			this.root=null;
		}
		void leftView(Node root) throws Exception{
			LinkedList<Node> q= new LinkedList<Node>();
			q.add(root);
			System.out.println(" "+root.data);
			while(!q.isEmpty() ){
				int ln=q.size();
			while(ln>0){
				Node t = q.poll();
				
				if(t.right!=null){
					q.add(t.right);
					
				}
				if(t.left!=null){
					q.add(t.left);
			}
			
			ln--;
			}
			System.out.println(q.getLast().data);
			
			}
		}
		public static void main(String [] args )throws Exception{
			LeftViewTree lv = new LeftViewTree();
			lv.root=new Node(12);
			lv.root.left=new Node(10);
			lv.root.right=new Node(30);
			lv.root.right.left=new Node(25);
			lv.root.right.right=new Node(40);
			lv.leftView(lv.root);
		}
}