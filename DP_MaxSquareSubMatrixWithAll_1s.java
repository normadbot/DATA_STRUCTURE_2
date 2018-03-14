import java.lang.*;
import java.util.*;
public class DP_MaxSquareSubMatrixWithAll_1s{
	public static void main(String [] args){
		int a[][]={{0,1,0,1,0,1},
				   {1,0,1,0,1,0},
				   {0,1,1,1,1,0},
				   {0,0,1,1,1,0},
				   {1,1,1,1,1,1},
				   };
			int b[][]= new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[0].length;j++){
					if(i==0||j==0){
						b[i][j]=a[i][j];	
					}else if(a[i][j]==1){
						b[i][j]=Math.min(b[i][j-1],Math.min(b[i-1][j],b[i-1][j-1]))+1;
					}else if(a[i][j]==0){
						b[i][j]=0;
					}
				}
			}
			int s=0;
			for(int i=0;i<b.length;i++){
				for(int j=0;j<b[0].length;j++){
					if(b[i][j]>s){
						s=b[i][j];
					}
				}
			}
			System.out.println(s);
	}
}
