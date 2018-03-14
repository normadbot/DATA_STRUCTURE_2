import java.lang.*;
import java.util.*;
public class DP_RodCutting{
		public static void main(String [] args){
				int len=5;
				int val[]={2,3,7,8,9};
				maxProfit(len,val);
		}
		static void maxProfit(int len,int val[]){
			int T[][]= new int[val.length+1][len+1];
			for(int i=0;i<=val.length;i++){
				for(int j=0;j<=len;j++){
					if(i==0||j==0){
						T[i][j]=0;
					}else if(j>=i){
						T[i][j]=Math.max(val[i-1]+T[i][j-i],T[i-1][j]);
					}else{
						T[i][j]=T[i-1][j];
					}
				}
			}
			System.out.println("Profit is :"+T[val.length][len]);
			for(int i=0;i<=val.length;i++){
				for(int j=0;j<=len;j++){
					System.out.print(T[i][j]+" ");
				}
				System.out.println();
			}
			//Profit is :11
			// 0 0 0 0 0 0
			// 0 2 4 6 8 10
			// 0 2 4 6 8 10      // answer//
			// 0 2 4 7 9 11
			// 0 2 4 7 9 11
			// 0 2 4 7 9 11
		}
}
