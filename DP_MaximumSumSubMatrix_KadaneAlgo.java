import java.lang.*;
import java.util.*;
public class DP_MaximumSumSubMatrix_KadaneAlgo{
		public static void main(String [] args){
			int a[][]={{2,1,-3,-4,5 },
						{0,6,3,4,1  },
						{2,-2,-1,4,-5},
						{-3,3,1,0,3 }};
					
						
			
			int maxValue=0;
			int curr_max=0;
			int maxLeft=0;
			int maxRight=0;
			int max_up=0;
			int max_down=0;
			int temp[]=new int[a[0].length];
			for(int L=0;L<a[0].length;L++){
				for(int k=0;k<a.length;k++)temp[k]=0;
				for(int R=0;R<a[0].length;R++){
					for(int i=0;i<a.length;i++){
						temp[i]+=a[i][R];
					}
					int sum=0,max=0;
					int s=0,start=0,end=0;
					for(int j=0;j<temp.length;j++){
						sum=sum+temp[j];
						if(sum<0){
							sum=0;
							s=j+1;
						}
						if(sum>max){
							max=sum;
							start=s;
							end=j;
						}
					}
					curr_max=max;
					if(curr_max>maxValue){
						maxValue=curr_max;
						maxLeft=L;
						maxRight=R;
						max_up=start;
						max_down=end;
					}
				}
			}
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
				System.out.println(maxValue);
				System.out.println("MaxL "+maxLeft);
				System.out.println("MaxR"+maxRight);
				System.out.println("MaxU"+max_up);
				System.out.println("MaxD"+max_down);
			for(int i=max_up;i<=max_down;i++){
				for(int j=maxLeft;j<=maxRight;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
}