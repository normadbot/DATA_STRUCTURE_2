import java.lang.*;
import java.util.*;
public class EX1J{
		static int recursion(int x)
			{ 
				if(x==0)
					return 0;
				else if (x==1)
					return 1;
				else 
					return (recursion(x-1)+recursion(x-2));
			}
	public static void main (String []  args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice for methods for Fibonacci");
		System.out.println("1.Recursion \n2.By-for-Loop");
		int c = sc.nextInt();
		switch(c) {
		case 1 :
			System.out.println("Enter the number till you want print Fibonacci series");
			int n1 = sc.nextInt();
			 for (int  d =1 ; d <= n1 ; d++ )
			   {
				  System.out.print( recursion(d));
			   }
			
			break;
		case 2:
			 System.out.println("Enter the number till you want print Fibonacci series");
			 int n2 = sc.nextInt();
			 int e=0,f=1,g;
			 g=e+f;
			 System.out.print(e);
			 System.out.print(f);
			 for(int i=2;i<n2;i++){
					
					g=e+f;
					e=f;
					f=g;
					System.out.print(g);
			 }			 
			 break;
		default: System.out.println("Please enter Only 1 or 2 value only ");
		
		}
	}

}