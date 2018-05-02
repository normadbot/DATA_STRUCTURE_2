import java.lang.*;
import java.util.*;
import java.io.*;
class Base{
	static void display(){
		System.out.println("static Display in Base class");
	}
	void print(){
		System.out.println("print method in the Base class");
	}
	void pek(){
		System.out.println("geenj");
	}
}
public class Derived1 extends Base{
	static void display(){
		System.out.println(" static Display in Derived class");
	}
	void print(){
		System.out.println("print method in Derived Class");
	}
	void hello(){
		System.out.print("hello");
	}
	public static void main(String[] args) {
	//	Derived1 d= new Derived1();//prints both child class methods//
	//	Base d= new Derived1();//prints display of base class but print of derived class//
		Derived1 d = new Derived1();
		d.display();
		d.print();
		d.hello(); 
		d.pek();
	}

}