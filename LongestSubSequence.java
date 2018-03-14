import java.lang.*;
import java.util.*;
public class LongestSubSequence{
		public static void main(String [] args){
			String s2="AGGTAB";
			String s1="GXTXAYB";
			char x[]=s1.toCharArray();
			char y[]=s2.toCharArray();
			int m=x.length;
			int n=y.length;
			int res=LCS(x,y,m,n);
		//	System.out.println(m);
		//	System.out.println(n);
		}
		static int LCS(char x[],char y[],int xL,int yL){
			int l[][]=new int[xL+1][yL+1];
			char str[]=new char[xL+yL];
			int t=0;
			
			for(int i=0;i<=xL;i++){
				for(int j=0;j<=yL;j++){
					if(i==0 || j==0){
						l[i][j]=0;
					}else if(x[i-1]==y[j-1]){
						l[i][j]=l[i-1][j-1]+1;
						System.out.println(x[i-1]);
						
					}else{
						l[i][j]=Math.max(l[i-1][j],l[i][j-1]);
					}
				}
			}
			
			for(int i=0;i<xL+1;i++){
				for(int j=0;j<yL+1;j++){
					System.out.print(l[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("The Longest Common String is :");
			System.out.println(l[xL][yL]);
				char e=x[xL-1];
				str[t++]=e;
				int r=l[xL][yL];
				for(int i=xL;i>0;i--){
					for(int j=yL;j>0;j--){
						if(l[i][j]<r){
							str[t++]=y[j-1];
							r=l[i][j];
							break;
						}
					}
				}
			System.out.println(Arrays.toString(str));	
			return l[xL][yL];
		}
}
