import java.lang.*;
import java.util.*;
class Node{
	protected int  data;
	protected Node link;
	
	
	public Node(int d,Node l){
		link=l;
		data=d;
	}
	public Node(){
		link = null;
		data=0;
	}
	public int getData(){
		return data;
	}
	public void setData(int d){
		data=d;
	}
	public Node getLink(){
		return link;
	}
	public Node setLink(Node l){
		link=l;
	}
	
	
}
//class LinkedList{
	//protected Node start;
	
}//