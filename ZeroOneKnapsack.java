import java.lang.*;
import java.util.*;
public class ZeroOneKnapsack {
			public static void main(String [] args){
				int wt[]={10,20,30};
				int val[]={60,100,120};
				int kwt=50;
				knapsack(wt,val,kwt);
			}
			static void knapsack(int []wt,int []val,int kwt){
				int l[][]=new int[wt.length+1][kwt+1];
				for(int i=0;i<=wt.length;i++){
					for(int j=0;j<=kwt;j++){
						if(i==0 || j==0){
							l[i][j]=0;
						}else if(wt[i-1]<=j){
							l[i][j]=Math.max(val[i-1]+l[i-1][j-wt[i-1]],l[i-1][j]);
						}
						else{
							l[i][j]=l[i-1][j];
						}
					}
				}
			
				for(int i=0;i<=wt.length;i++){
					for(int j=0;j<=kwt;j++){
						System.out.print(l[i][j]+"  ");
					}
					System.out.println();
				}
				int sum=0;
				for(int i=wt.length;i>0;){
					for(int j=kwt;j>1;){
						if(l[i][j]!=l[i-1][j]&&l[i][j]!=l[i-1][j-1]&&l[i][j]!=l[i][j-1]){
							System.out.println(val[i-1]+" "+wt[i-1]);
							sum+=wt[i-1];
							i--;
							j=j-val[i-1];
						}else if(l[i][j]==l[i-1][j]){
							i--;
						}else if(l[i][j]==l[i][j-1]){
							j--;
						}
					}
						if(sum==kwt)break;
				}
				
			}
}