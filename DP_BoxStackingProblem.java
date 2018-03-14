import java.lang.*;
import java.util.*;
public class DP_BoxStackingProblem{
		public static void main(String []args){
			int price_day[]={2,5,7,1,4,3,1,3};
			int k=3;
			int T[][]=new int[k+1][price_day.length];
			for(int i=0;i<=k;i++){
				for(int j=0;j<=price_day.length;j++){
					if(i==0||j==0){
						T[i][j]=0;
					}else{
						int max=-1;
						for(int m=0;m<j;m++){
							int diff=price_day[j]-price_day[m]+T[i-1][m];
							if(diff>max)max=diff;
						}
						T[i][j]=Math.max(max,T[i][j-1]);
					}
				}
			}
			for(int i=0;i<=k;i++){
				for(int j=0;j<=price_day.length;j++){
					System.out.print(T[i][j]+" ");
				}
				System.out.println();
			}
		}
}
