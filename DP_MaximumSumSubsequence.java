import java.lang.*;
import java.util.*;
public class DP_MaximumSumSubsequence{
		public static void main(String [] args){
			int a[]={4,6,1,3,8,4,6};
			int maxval[]= new int[a.length];
			int seq[]=new int[a.length];
			for(int i=0;i<a.length;i++){
				maxval[i]=a[i];
				seq[i]=i;
			}
			for(int i=1;i<a.length;i++){
				for(int j=0;j<i;j++){
					if(a[i]>a[j]){
						if(maxval[i]<(a[i]+maxval[j])){
							maxval[i]=a[i]+maxval[j];
							seq[i]=j;
						}
					}
				}
			}
			int max_sum=0;
			int r=0;
			for(int i=0;i<maxval.length;i++){
				if(max_sum<maxval[i]){
					max_sum=maxval[i];
					r=i;
				}
			}
			
			System.out.println("The maximum Sum of Subsequence us :"+max_sum);
			System.out.println(Arrays.toString(maxval));
			System.out.println(Arrays.toString(seq));
			System.out.print("The SubSequence is:");
			int s=0;
			while(s!=max_sum){
				System.out.print(a[r]+" ");
				s+=a[r];//to reach the sum of the max_sum to terminate the condition//
				r=seq[r];
			
			}
		}
}