import java.lang.*;
import java.util.*;

class DP_PathswithObstructionin2DArray {
	public static void main (String[] args) {
         int arrA [][] = {{1,1,1},
						{1,-1,1},
						{1,1,1}};
        int p=pathCount(arrA);
        System.out.println(p);
	}
	static int pathCount(int a[][]){
    	int dp[][]= a;
    	for(int i=1;i<dp.length;i++){
    	    for(int j=1;j<dp[0].length;j++){
    	        if(dp[i][j]!=-1){
    	            dp[i][j]=0;
    	        if(dp[i-1][j]>0){
    	            dp[i][j]+=dp[i-1][j];
    	        }if(dp[i][j-1]>0){
    	            dp[i][j]+=dp[i][j-1];
    	        }
			  }
    	    }
    	}
		for(int i=0;i<dp.length;i++){
			for(int j=0;j<dp[0].length;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
    	return dp[a.length-1][a[0].length-1];
	}
}