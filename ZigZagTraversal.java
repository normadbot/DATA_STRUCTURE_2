import java.lang.*;
import java.util.*;
public class ZigZagTraversal{
		public static void main(String [] args){
			int a[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
			int l=a.length;
			int i=0;
			while(i<l){
				int j=0;
				if(i%2==0){
				while(j<l){
					System.out.print(a[i][j]+" ");
					j++;
				}
				System.out.println();
				}else{
					int k=l-1;
				while(k>=0){
					System.out.print(a[i][k]+" ");
					k--;
				}
				System.out.println();
				}
				i++;
			}
		}
}