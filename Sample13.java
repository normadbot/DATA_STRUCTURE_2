import java.lang.*;
import java.util.*;
public class Sample13 {
		public String Method1(){
			return "Hi this through IS-A Relationship method ";	
		}

	public static void main(String []  args ) {
		Sample14 a = new Sample14();
		
	}

}
class Sample14 extends Sample13{
	public Sample14(){
		System.out.println("Thsi si message:"+Method1());
	}
	
	
}