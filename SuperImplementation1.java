import java.lang.*;
import java.util.*;
import java.io.*;
class Person{
	void msg(){
		System.out.println("This is Person class");
	}
}
class Student extends Person{
	void msg(){
		System.out.println("This is Student class");
	}
	void display(){
		msg();
		super.msg();
	}
} 
class SuperImplementation1{
	public static void main(String[] args) {
		Student a = new Student();
		a.display();
	}
}
