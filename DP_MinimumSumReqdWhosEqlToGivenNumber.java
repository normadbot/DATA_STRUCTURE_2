import java.lang.*;
import java.util.*;
public class DP_MinimumSumReqdWhosEqlToGivenNumber{
		public static void main(String [] args){
			int n=12;
			int sq=(int)Math.sqrt(n);
			int MN[]= new int[n+1];
			int  NUM[] = new  int[sq+1];
			
			for(int number=1;number<=n;number++){
				for(int i=0;i<=sq;i++){
					NUM[i]=0;
				}
				for(int j=1;j<=sq;j++){
					if(j*j<=number){
						NUM[j]=MN[number-j*j]+1;
					}
				}
				System.out.println(Arrays.toString(NUM));
				System.out.println(Arrays.toString(MN));
				MN[number]=-1;
			for(int j=1;j<NUM.length;j++){
				if(NUM[j]>0&&(MN[j]==-1|| MN[number]>NUM[j])){
					MN[number]=NUM[j];
				}
			}
				System.out.println(Arrays.toString(MN));
				System.out.println("ends");
		}
			System.out.println(MN[n]+" here");
		}
}
