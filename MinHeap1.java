import java.lang.*;
import java.util.*;
 class MinHeap1{
		public static void main(String [] args ){
			int a[]= {4,10,3,5,1};
			System.out.println("Before Min-Heap");
			System.out.println(Arrays.toString(a));
			System.out.println("After Min-Heap");
			
			for(int i=0;i<a.length/2;i++){
				int j=2*i+1;
				if(a[i]<=(a[j]) ){
					int t1=a[i];
					a[i]=a[j];
					a[j]=t1;
				}
				  if(a[i]<=(a[j+1]) ){
					int t2=a[i];
					a[i]=a[j+1];
					a[j+1]=t2;
				}
				
			}
			
			System.out.println(Arrays.toString(a));
		
		
		}
}