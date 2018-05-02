import java.lang.*;
import java.util.*;
import java.io.*;
class Parent{
	void doStuff(){
		System.out.println("Here doStuff");
	}
}
class Child extends Parent{
	void stuff(){
		System.out.println("here I am doing some stuff");
	}
}
class StatParent{
	static void doStuff(){
		System.out.println("Here doStuff stat");
	}
}
class StatChild {
	static void stuff(){
		System.out.println("Here I am Doing some Stat stuff");
	}
}
public class Object_Doubts{
	public static void main(String[] args) {
			//Parent p= new Parent();//runs only parent method//
			//Child p= new Child();//runs both method //
			//Parent p= new Child();//runs only parent class method//
			//error//Child p= new Parent();//compile time error as can't be converted to child 
			
			// for static methods in class//
			//StatParent p= new StatParent();// only Parent class methods only//
			//StatChild p= new StatChild();// runs both the methods of th class
		//	StatParent p = new StatChild();
			p.doStuff();
			p.stuff();			
	}
}