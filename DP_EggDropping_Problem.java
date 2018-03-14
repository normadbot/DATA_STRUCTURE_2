import java.lang.*;
import java.util.*;
public class DP_EggDropping_Problem{
		public static void main(String [] args){
			int N=6;
			int e=2;
			int T[][]= new int[e+1][N+1];
			for(int i=1;i<=e;i++){
				for(int j=1;j<=N;j++){
					if(i==1){
						T[i][j]=j;
					}
					else if(i>j){
						T[i][j]=T[i-1][j];
					}else{
						int min=Integer.MAX_VALUE;
						for(int k=1;k<=j;k++){
							int f=1+Math.max(T[e-1][k-1],T[e][j-k]);
							if(min>f)min=f;
						}
						T[i][j]=min;
					}
				}
			}
			for(int i=0;i<=e;i++){
				for(int j=0;j<=N;j++){
					System.out.print(T[i][j]+" ");
				}
				System.out.println();
			}
			// 0 0 0 0 0 0 0
			// 0 1 2 3 4 5 6
			// 0 1 2 2 3 3 3
		}
}
