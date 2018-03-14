import java.lang.*;
import java.util.*;
public class Quicksort1 {
		
		
		public static void quickSort(int[] a, int i, int j)
		{	int p=a[low],low=i;high=j;
			int t=0;
			while(p<a[j]&&i!=j)
			{j--;
			}
			if(i==j){
				t=1;
			}
			else
			{int tm=p;
				a[j]=p;
				p=tm;}
				
			low=j;
			
			
			
		}
			
			
		
		public static void main(String [] args ){
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int n = s.nextInt();
			System.out.println("Enter the Elelments of an array");
			int a[] = new int[n];
			for(int k=0;k<n;k++){
				a[k]=s.nextInt();
			}		
				
			quickSort(a,0,n-1);
			
			for(int j = 0;j<n;j++){
				System.out.print(a[j]+" ");
			}
			
		}
		

}
	
                                                                        																	
																		