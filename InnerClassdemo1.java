import java.lang.*;
import java.util.*;
import java.io.*;
class Outer{
	static int o_x=10;
	int o_y=20;
	private int o_p=30;

	class InnerClass{
		void display(){
			System.out.println("Outer static "+o_x);
			System.out.println("Outer instance "+o_y);
			System.out.println("Private outer int "+o_p);
		}
	}
}
public class InnerClassdemo1{
	public static void main(String[] args) {
		Outer ab = new Outer();
		Outer.InnerClass a= ab.new InnerClass();//for instance we do this and not the other as static innere class//klkl
		

		a.display();
	}

}