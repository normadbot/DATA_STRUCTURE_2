import java.lang.*;
import java.util.*;
public class DP_MinimumCoinExchange{
		public static void main(String [] args){
			int sum =11;
			int coins[]={1,5,6,8};
			int T[][]= new int[coins.length+1][sum+1];
			for(int i=0;i<=coins.length;i++){
				for(int j=0;j<=sum;j++){
					if(i==0||j==0){
						T[0][j]=j;
						T[i][0]=0;
					}else if(j>=coins[i-1]){
						T[i][j]=Math.min(T[i-1][j],1+T[i][j-coins[i-1]]);
					}else if(coins[i-1]>j){
						T[i][j]=T[i-1][j];
					}
				}
			 }
			System.out.println(T[coins.length][sum]);
			// for(int i=0;i<=coins.length;i++){			
				// for(int j=0;j<=sum;j++){
					// System.out.print(T[i][j]+" ");
				// }
				// System.out.println();
			// }
			// 0 1 2 3 4 5 6 7 8 9 10 11
			// 0 1 2 3 4 5 6 7 8 9 10 11
			// 0 1 2 3 4 1 2 3 4 5 2 3
			// 0 1 2 3 4 1 1 2 3 4 2 2
			// 0 1 2 3 4 1 1 2 1 2 2(2) <- answer//
		}
}
