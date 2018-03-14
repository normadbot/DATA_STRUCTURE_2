import java.lang.*;
public class Ee {
	public static void valid(int i){
		if(i<18){
			throw new ArithmeticException ("Not Valid");
		}
		else 
			System.out.println("Welcome");
		
	}
 public static void main (String [] args ) {
	try {
		valid(16);
	}
     catch(ArithmeticException e){
		 System.out.println(e);
	 }
 }
} 