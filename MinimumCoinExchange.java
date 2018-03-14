import java.lang.*;
import java.util.*;
public class MinimumCoinExchange{
		public static void main(String [] args){
			Scanner sc= new Scanner(System.in);
			int s,c;
			s=sc.nextInt();
			c=sc.nextInt();
			int coins[]=new int[c+1];
			int T[][]= new int[c+1][s+1];
			for(int i=1;i<=c;i++){
				coins[i]=sc.nextInt();
			}
			
			for(int i=0;i<=c;i++){
				for(int j=0;j<=s;j++){
					if(i==0||j==0){
						T[i][0]=1;
					}else if(j>=coins[i]){
						T[i][j]=T[i-1][j]+T[i][j-coins[i]];
					}else if(coins[i]>j){
						T[i][j]=T[i-1][j];
					}
				}
			}
			for(int i=0;i<=c;i++){
				for(int j=0;j<=s;j++){
					System.out.print(T[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println(T[c][s]);
		}
}