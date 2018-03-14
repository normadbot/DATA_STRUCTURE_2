import java.lang.*;
import java.util.*;
public class Kadane_MinimumContigousSubarray{
		public static void main(String []rgs){
			int a[]={3,4,-2,-3,-1};
			int sum=0;
			int min=0;
			
			int s=0,start=0,end=0;
			for(int i=0;i<a.length;i++){
				sum=sum+a[i];
				if(sum>a[i]){
					sum=a[i];
					s=i;
				}
				if(min>sum){
					min=sum;
					start=s;
					end=i;
				}
			}
			System.out.println(min);
			
			for(int i=start;i<=end;i++){
				System.out.print(a[i]+" ");
			}
		}
}