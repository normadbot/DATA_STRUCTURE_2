import java.lang.*;
import java.util.*;
public class SquareRoot1{
		static  void sqrt1(double n){
			 double	 x = n;
  double y = 1;
  double e = 0.000001; /* e decides the accuracy level*/
  while(x - y > e)
  {
    x = (x + y)/2;
    y = n/x;
  }
  
			System.out.println("The Square Root is"+x);
		}
		
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter teh nUmber to Check for SquareRootc test");
			double n= s.nextDouble();
			sqrt1(n);
		}
}