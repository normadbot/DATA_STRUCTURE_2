import java.lang.*;
import java.util.*;
import java.io.*;
public class EX1K{
	 static double fact(int n)
	{
       double output;
       if(n==1){
         return 1;
       }
       output = fact(n-1)* n;
       return output;
	}	
	
	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number");
		int n1 = sc.nextInt();
		double n=0;
		for (int i=2;i<=n1;i++){
			n=n+(1/fact(i-1));
			
		}
	System.out.print(n);
	
	}

}