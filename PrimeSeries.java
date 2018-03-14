import java.lang.*;
import java.util.*;
public class PrimeSeries {
	public static void main(String [] args ) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Limit for Prime number");
		int n = s.nextInt();
		int i=2;
		do{
				int t=0,j=2;
				while(j<=i){ 
					if(i%j==0)
					{t++;}
					j++;
				}
			if(t==1){
				System.out.print(i+" ");
			}	
			i++;
		}while(i<=n);
	}
}	

          