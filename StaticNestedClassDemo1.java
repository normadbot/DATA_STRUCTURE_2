import java.lang.*;
import java.util.*;
import java.io.*;
class Outer{
	static int o_x=10;
	int o_y=20;

	private static int o_p=30;
	static class StaticNestedClass{
		void display(){
			System.out.println("Outer x "+o_x);
			System.out.println("Outer Private "+o_p);
		//	System.out.println(" outer Instance "+o_y);
		}
	}
}
public class StaticNestedClassDemo1{
	public static void main(String[] args) {
		Outer.StaticNestedClass st= new Outer.StaticNestedClass(); // for static class we do this onlhy
	/*	Outer ab= new Outer();
		Outer.StaticNestedClass st= ab.new StaticNestedClass();
*/
		st.display();
	}
}