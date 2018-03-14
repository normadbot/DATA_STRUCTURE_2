import java.lang.*;
import java.util.*;
public class FloorofArray1{
		public static void main(String [] args ) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the array Size");
			int n =s.nextInt();
			int a[] = new int[n];
			System.out.println("Enter the array Elements in Sorted order");
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
			}
			System.out.println("Enter a Number to find floor of array");
			int num = s.nextInt();
			int b[]=new int[n];
			for(int j=0;j<n;j++){
				int sub=num-a[j]; 
					if((sub)>0){
						b[j]=a[j];								//1 6 8 12 19
					}
				
			}
			int max=b[0];
			for(int k=1;k<b.length;k++){
				if(max<b[k]){
					max=b[k];
				}
			}
			
			
			System.out.println(max);
			
		
		
		}
}