import java.lang.*;
import java.util.*;
public class SumArray1{
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
				int sub = num-a[i];
				for(int j=n-1;j>=0;j--){
					if(a[j]==sub){
						System.out.println("The sum of position"+j+" and "+i+" is "+num);
					}
				}
				
			}
		}
		

}