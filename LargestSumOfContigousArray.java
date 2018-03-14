import java.lang.*;
import java.util.*;
public class LargestSumOfContigousArray{
		public static void main(String [] args){
			int a[]={-2, -3, 4, -1, -2, 1, 5, -3};
			int sum=findSum(a);
			System.out.print(sum);
		}
		static int findSum(int a[]){
			int sum=1;
			for(int i=0;i<a.length;i++){
				int m=0;
				for(int j=i;j<a.length;j++){
					m=m+a[j];
					if(m>sum){
						sum=m;
					}
				}
			}
			return sum;
		}
}
