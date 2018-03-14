import java.lang.*;
import java.util.*;
public class SumOfSubarrayOfparticularSum{
		public static void main(String [] aths){
			int a[]={10, 2, -2, -20, 10};
			int b[]={-10, 0, 2, -2, -20, 10};
			int s1=-10;
			int s2=20;
			findRangeOfIndex(b,s2);
		}
		static void findRangeOfIndex(int a[],int sum){
			int c=0;
			for(int i=0;i<a.length;i++){
				int m=0;c=0;
				for(int j=i;j<a.length;j++){
					m=m+a[j];
					if(m==sum){
						System.out.println(i+" range "+j);
						c++;
					}
				}
			}
			if(c==0)System.out.println("No Range Exist");
		}
}