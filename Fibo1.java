import java.lang.*;
import java.util.*;
public class Fibo1{
		public static void main(String [] args ){
			System.out.println("Enter a Number");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int a=0,b=1,c;
			for(int i=0;i<n;i++){
				System.out.print(" "+a);
				c=a+b;
				a=b;
				b=c;
			}
		}
}