import java.lang.*;
import java.util.*;
class GenStack<E>{
	private LinkedList<E> list=new LinkedList<E>();
	public void push(E item){list.addFirst(item);}
	public E pop(){return list.poll();}
	public E peek(){return list.peek();}
	public boolean hassItem(){return list.isEmpty();}
	public int size(){ return list.size();}
}
public class StackTest{
	public static void main(String args[]){
		GenStack<String> gs= new GenStack<String>();
		System.out.println("Pushing Apple,orange,Guava and Pineapple into the stack");
		gs.push("Apple");
		gs.push("Orange");
		gs.push("Guava");
		gs.push("Pineapple");
		System.out.println("There Are now "+gs.size()+"items in Stack "+ "And the top Item is "+gs.peek());
		System.out.println("whem  items are popped from the stack , then they are seen as");
		while(gs.hasItems()){System.out.println(gs.pop());}
		System.out.println("There Are now "+gs.size()+"items in Stack "+ "And the top Item is "+gs.peek());
	}
}