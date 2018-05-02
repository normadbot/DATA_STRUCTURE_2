import java.lang.*;
import java.util.*;
public class MatrixDiagnalSpiralMxN{
	public static void main(String [] args){
		int a[][]={	{1,9,3,4},
					{2,7,8,9},
					{2,7,8,4},
					{1,7,3,4}};

			int m=a.length;
			int n=a[0].length;
			System.out.println(n);
			System.out.println(m);
			for(int k=0;k<=m-1;k++){
				int i=k;
				int j=0;
				while(i>=0){
					if(k%2==0){
					System.out.print(" "+a[i][j]);
					i=i-1;
					j=j+1;
				 }else{
				 	System.out.print(" "+a[j][i]);
					i=i-1;
					j=j+1;
				 }
				}
			}
			System.out.println();
			for(int k=1;k<=n-1;k++){
				int i=m-1;
				int j=k;

				while(j<=n-1){
						if(k%2!=0){
					System.out.print(" "+a[i][j]);
					i=i-1;
					j=j+1;
				 }else{
				 	System.out.print(" "+a[j][i]);
					i=i-1;
					j=j+1;
				 }			
				}
			}
	}

}
