import java.lang.*;
import java.util.*;
import java.util.HashMap;
import java.util.Stack;
class Node{
	int freq;
	char ch;
	Node left,right;
	public Node(int freq,char ch){
		this.freq=freq;
		this.ch=ch;
		this.left=this.right=null;
		
	}
}
public class HuffmanCoding{
	boolean check(char a[]){
		int c=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!='N'){
				c++;
			}
		}
		if(c==0)return false;
		else return true;
	}
	void sortAndRemove(int fr[],char chr[],int c1,char c2){
		fr[0]=c1;
		chr[0]=c2;
		fr[1]=999;
		chr[1]='N';
		for(int i=0;i<fr.length-1;i++){
			for(int j=0;j<fr.length-i-1;j++){
				if(fr[j]>fr[j+1]){
					int t=fr[j];
					fr[j]=fr[j+1];
					fr[j+1]=t;
					
					char tc=chr[j];
					chr[j]=chr[j+1];
					chr[j+1]=tc;
				}
			}			
		}
	}
	Stack<Node> q= new Stack<Node>();
	void insertInternalNode(int a1,char b1,int a2,char b2,int c1,char c2){
		// System.out.println("a1 value "+a1);
		// System.out.println("a2 value "+a2);
		// System.out.println("c1 value "+c1);
		Node newNode= new Node(c1,c2);
		int cnl=0,cnr=0;
		for(Node x:q){
			if(x.freq==a1){
				newNode.left=x;
				cnl=1;
				// System.out.println("Here 1");
			}
			if(x.freq==a2){
				newNode.right=x;
				cnr=1;
				// System.out.println("Here 2");
			}
		}
		
		if(cnl==0){
			Node ln= new Node(a1,b1);
			newNode.left=ln;
			q.push(ln);
			// System.out.println("Here 3");
		}
		if(cnr==0){
			Node rn=new Node(a2,b2);
			newNode.right=rn;
			q.push(rn);
			// System.out.println("Here 4");
		}
		q.push(newNode);
	}
	void inorder(Node root){
		if(root!=null){
			inorder(root.left);
			System.out.print(root.freq+" ");
			inorder(root.right);
		}
	}
	void getCodes(Node root){
		int path[]=new int[10];
		print(root,path,false,0);
	}
	void print(Node root,int path[],boolean left,int c){
		if(root==null)return;
		if(left){
			path[c++]=0;
		}else if(!left){
			path[c++]=1;
		}
		if(root.left==null && root.right==null){
			System.out.print(" ");
			printArray(path,c);
		}else{
			print(root.left,path,true,c);
			print(root.right,path,false,c);
		}
	}
	void printArray(int a[],int path){
		for(int i=1;i<path;i++){
				System.out.print(a[i]);
		}
		// System.out.println();
	}
		public static void main(String [] arst){
			HuffmanCoding a =new HuffmanCoding();
			int fr[]= new int[6];
			char chr[]= new char[6];
			fr[0]=5; chr[0]='a';
			fr[1]=9;  chr[1]='b';	
			fr[2]=12; chr[2]='c';
			fr[3]=13;  chr[3]='d';
			fr[4]=16;   chr[4]='e';
			fr[5]=45;	chr[5]='f';
			while(a.check(chr)){
				int a1 =fr[0]; int a2=fr[1];
				char b1=chr[0]; char b2=chr[1];
				int c1=a1+a2;
				char c2='N';
				a.insertInternalNode(a1,b1,a2,b2,c1,c2);
				a.sortAndRemove(fr,chr,c1,c2);
			}
			// for(Node b:a.q){
				// System.out.println(b.freq);
			// }
			Node t=a.q.peek();
		//	a.inorder(t);
			System.out.println();
			a.getCodes(t);
		}
}