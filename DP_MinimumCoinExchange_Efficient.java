import java.lang.*;
import java.util.*;
public class DP_MinimumCoinExchange_Efficient{
	public static void main(String [] args){
		int t=13;
		int coins[]={7,2,3,6};
		long T[]= new long[t+1];
		int res[]= new int[t+1];
		Arrays.fill(res,-1);
		Arrays.fill(T,Integer.MAX_VALUE);
		T[0]=0;
		for(int i=0;i<coins.length;i++){
			for(int j=coins[i];j<=t;j++){
					if((T[j-coins[i]]+1)<T[j]){
						T[j]=1+T[j-coins[i]];
						res[j]=i;
					}
				
			}
		}
		System.out.println(Arrays.toString(T));
		System.out.println(Arrays.toString(res));
	}
}
