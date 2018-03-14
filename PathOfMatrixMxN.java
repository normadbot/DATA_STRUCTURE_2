import java.lang.*;
import java.util.*;
public class PathOfMatrixMxN{
	static int diff=99999;
	int pos=0;
			public static void main(String [] args){
				
				int a[][] = {{5,4,2}
							,{9,2,1},
							{2,5,9},
							{1,3,11},
							}; 
						int res[]=new int[a.length+a[0].length];
						printpath2(a,0,0,0,res);
						System.out.println(diff);
			}
			static void printpath2(int a[][],int i,int j,int pos,int res[]){
		if(i>=a.length|| j>=a[0].length)return;
		if(i==a.length-1 && j==a[0].length-1){
			res[pos]=a[i][j];
		System.out.println(Arrays.toString(res));
			return;
		}
		res[pos]=a[i][j];
		printpath2(a,i,j+1,pos+1,res);
		printpath2(a,i+1,j,pos+1,res);
	}
}
