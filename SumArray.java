import java.lang.*;
import java.util.*;
public class SumArray{
		public static void main(String [] args){
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int n = s.nextInt();
			System.out.println("Enter the Elelments of an array");
			int a[] = new int[n];
			for(int k=0;k<n;k++){
				a[k]=s.nextInt();
			}	
			System.out.println("Enter the number for sum check");
			int num = s.nextInt();
			for(int i=0;i<n;i++){
					for(int j=i+1;j<n;j++){
						if((a[i]+a[j])==num){
						System.out.println("Sum is present in trhe array at position :"+i+" and"+j);
						}
					}
			}
		}
		

}