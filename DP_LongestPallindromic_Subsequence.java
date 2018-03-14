import java.lang.*;
import java.util.*;
public class DP_LongestPallindromic_Subsequence{
		public static void main(String [] args){
			String s1="abacaba";
			char a[]=s1.toCharArray();
			int T[][]=new int[a.length][a.length];
			for(int i=0;i<a.length;i++)T[i][i]=1;
			 
			
			for(int l=2;l<=a.length;l++){
				for(int i=0;i<a.length-l+1;i++){
					int j=l+i-1;
					if(l==2 && a[i]==a[j]){
						T[i][j]=2;
					}else if(a[i]==a[j]){
						T[i][j]=T[i+1][j-1]+2;
					}else{
						T[i][j]=Math.max(T[i+1][j],T[i][j-1]);
					}
				}
			}
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(T[i][j]+" ");
				}
				System.out.println();
			}
			String str="";
			int c=0;
			for(int i=0,j=T.length-1;i!=j;){
				
				if(a[i]==a[j]){
					str=a[i]+str+a[j];
					i++;
					j--;
					if(i==j)str+=a[i];
				}else{
					if(T[i][j]==T[i][j-1]){
						j--;
					}else{
						i++;
					}
				}
				
			}
			
			System.out.println(str);
			//System.out.println(a[c]);
		}
}