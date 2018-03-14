import java.lang.*;
import java.util.*;
public class FloorofArrayRecur{
		static int find(int []a,int beg,int end,int num){
			int mid=(beg+end)/2;
		 	if(num>=a[end]){
		             return end ; 	
			}
				
			if(num==a[mid]){
				return mid;
				
			}
		
			if(num<a[mid])
			return find(a,beg,mid-1,num);	
			
			return find(a,mid+1,end,num);
		
		}
		
		
	
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the array Size");
			int n =s.nextInt();
			int a[] = new int[n];
			System.out.println("Enter the array Elements in Sorted order");
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
			}
			//1 8 10 15 19 25  30 26//
			System.out.println("Enter a Number to find floor of array");
			int num = s.nextInt();
			int beg=0,end=n-1;
			int index=find(a,beg,end,num);
			System.out.println(a[index]);
		}
}