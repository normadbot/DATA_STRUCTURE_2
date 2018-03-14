import java.lang.*;
import java.util.*;
public class Matrix_Multiplication{
	public static void main(String [] arhs){
		int a[]={1,2,3,4,3};
		int n=a.length;
		System.out.println("Minimum number of multiplication is:"+matrixMul(a,1,n-1));
		
	}
	static int matrixMul(int p[],int i,int j){
		if(i==j)return 0;
		int min=Integer.MAX_VALUE;
		for(int k=i;k<j;k++){
			int count=matrixMul(p,i,k)+matrixMul(p,k+1,j)+p[i-1]*p[k]*p[j];
			if(count<min)min=count;
		}
		return min;
	}
}