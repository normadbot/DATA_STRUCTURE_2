import java.lang.*;
import java.util.*;
public class DP_MinimumEditDistance{
		public static void main(String [] args){
			String s_one="saturday";//Bigger String  or first string is converted to the secondf String //
			String s_two="sunday";
			char A[]=s_one.toCharArray();
			char B[]=s_two.toCharArray();
			int T[][]= new int[B.length+1][A.length+1];
			for(int i=0;i<=A.length;i++){
				T[0][i]=i;
			}
			for(int i=0;i<=B.length;i++){
				T[i][0]=i;
			}
			for(int i=1;i<=B.length;i++){
				for(int j=1;j<=A.length;j++){
					if(B[i-1]==A[j-1]){
						T[i][j]=T[i-1][j-1];
					}else{
						T[i][j]=Math.min(T[i-1][j-1],Math.min(T[i-1][j],T[i][j-1]))+1;
					}
				}
			}
			for(int i=0;i<=B.length;i++){
				for(int j=0;j<=A.length;j++){
					System.out.print(T[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The Minimum operation required to Convert is Are:"+T[B.length][A.length]);
			for(int i=B.length;i>0;){
				for(int j=A.length;j>0;){
					if(A[j-1]!=B[i-1]){
						if(T[i][j]==T[i-1][j-1]+1){
							System.out.println(A[j-1]+"->"+B[i-1]);	
							i--;j--;
						}else if(T[i][j]==T[i][j-1]+1){
							System.out.println(A[j-1]+"X");
							j--;
						}else if(T[i][j]==T[i-1][j]+1){
								System.out.println("Insert "+B[i-1] +" to place of "+A[j-1]);
								i--;
						}
					}else{
						i--;
						j--;
					}
				}
			}
		}
}