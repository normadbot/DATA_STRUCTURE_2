import java.lang.*;
import java.util.*;
public class QuickSort4 {
		static void sort(int [] a,int i,int j){
			int low=i,high=j;
			int p=a[(low+high)/2];
			while(i<j){
				while(p>a[i])i++;
				while(p<a[j])j--;								
				if(i<j){
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
				else{														
					int te=p;													//14 5 78 24 9 5
					p=a[j];													   
					a[j]=p;																	
				}
			}			
			if(low<j)sort(a,low,j-1);
			if(high>j)sort(a,j+1,high);
		}
		public static void main(String [] args ) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Size Of Array");
			int n=s.nextInt();
			System.out.println("Enter the Elements of an array");
			int a[]= new int[n];
			for(int j=0;j<n;j++){
				a[j]=s.nextInt();
			}
			sort(a,0,n-1);
			for(int k=0;k<n;k++){
				System.out.print(a[k]+" ");
			}
		}
}