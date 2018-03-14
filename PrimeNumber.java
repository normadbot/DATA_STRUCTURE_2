import java.lang.*;
import java.util.*;

public class PrimeNumber {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int t=0;
		for(int i=2;i<n;i++){
			
			if(n%i==0){
				t=1;	
			}
		}
		if(t==1)
		    System.out.println("It is not a prime");
		else 
			System.out.println("It is a prime");		
	}

}