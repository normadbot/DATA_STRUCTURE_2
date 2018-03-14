import java.lang.*;
import java.util.*;
public class DP_MinimumSumSubarrayMatrix_KadaneAlgo{
		public static void main(String [] args){
			int a[][]={{1,2,-1,-4,-20},
						{-8,-3,4,2,1},
						{3,8,10,1,3},
						{-4,-1,1,7,-6}};
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}			
						
			int maxLeft=0,maxRight=0,maxUp=0,maxDown=0;
			int cur_min=0,min_val=0;
			int temp[]=new int[a.length];
			for(int L=0;L<a[0].length;L++){
				
				for(int k=0;k<a.length;k++)temp[k]=0;
				
				for(int R=0;R<a[0].length;R++){
					
					for(int i=0;i<a.length;i++){
						temp[i]+=a[i][R];
					}
					
					int start=0,end=0,s=0;
					int sum=0,min=0;
					for(int i=0;i<temp.length;i++){
						sum+=temp[i];
						if(sum>temp[i]){
							sum=temp[i];
							s=i;
						}
						if(min>sum){
							min=sum;
							start=s;
							end=i;
						}
					}
					cur_min=min;
					if(cur_min<min_val){
						min_val=cur_min;
						maxLeft=L;
						maxRight=R;
						maxUp=start;
						maxDown=end;
					}
				}
			}
			System.out.println(cur_min);
			System.out.println("MaxLeft "+maxLeft);
			System.out.println("MaxRight "+maxRight);
			System.out.println("MaxUp "+maxUp);
			System.out.println("MaxDown "+maxDown);
			
			for(int i=maxUp;i<=maxDown;i++){
				for(int j=maxLeft;j<=maxRight;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
}