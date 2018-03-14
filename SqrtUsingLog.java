import java.lang.*;
import java.util.*;
public class SqrtUsingLog{
		public static void main(String [] ra) throws Exception{
			Scanner s = new Scanner(System.in);
			double n= s.nextDouble();
			System.out.println("The Square root of the "+n+" is: ");
			double x=0.5*Math.log(2*n);
			System.out.print(Math.pow(2,x));
		}
}