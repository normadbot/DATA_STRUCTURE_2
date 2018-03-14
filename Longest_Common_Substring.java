import java.lang.*;
import java.util.*;
public class Longest_Common_Substring{
			public static void main(String [] rga){
					String a="GeeksforGeeks";
					String b="HeisGeek";
					char A[]=a.toCharArray();
					char B[]=b.toCharArray();
					int r=0,c=0;
					int T[][]=new int[A.length+1][B.length+1];
					int result=0;
					for(int i=0;i<=A.length;i++){
						for(int j=0;j<=B.length;j++){
							if(i==0||j==0){
								T[i][j]=0;
							}else if(A[i-1]==B[j-1]){
								T[i][j]=T[i-1][j-1]+1;
								result=Math.max(T[i][j],result);
							}else{
								T[i][j]=0;
							}
						}
					}
					System.out.println(result);
					int max=0;
					for(int i=0;i<=A.length;i++){
						for(int j=0;j<=B.length;j++){
							if(T[i][j]>max){
								max=T[i][j];
								r=i;
								c=j;
							}
						}
					}
				
					for(int i=r,j=c;T[i][j]!=0;i--,j--){
						
							System.out.println(A[i-1]);
						
					}
			}
}		