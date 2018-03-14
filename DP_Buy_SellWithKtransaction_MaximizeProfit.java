import java.lang.*;
import java.util.*;
public class DP_Buy_SellWithKtransaction_MaximizeProfit{
		public static void main(String []args){
			int price_day[]={2,5,7,1,4,3,1,3};
			int k=3;
			int T[][]=new int[k+1][price_day.length+1];
			for(int i=0;i<=k;i++){
				for(int j=0;j<price_day.length;j++){
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
				for(int j=0;j<price_day.length;j++){
					System.out.print(T[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The maximum Profit is :"+T[k][price_day.length-1]);
			int max_p=0;
			
				for(int i=k,j=price_day.length-1;j>=0&&i>=0;){
					if(i==0){
						if(T[i][j]-price_day[j]==max_p){
							System.out.println("We buy on the day "+j+" -"+(price_day[j]));	
						}
						j--;
					}else if(T[i][j]!=T[i][j-1]){
						System.out.println("Selling on day: "+j+" +"+price_day[j]);
						max_p=T[i][j]-price_day[j];
						i--;
					}else{
						if(T[i][j]-price_day[j]==max_p){
							System.out.println("We buy on the day "+j+" -"+(price_day[j]));
							
						}
							j--;
					}
				
					
				}
			
			
		}
}
