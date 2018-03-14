import java.lang.*;
import java.util.*;
public class PrintNin2DArray{
		public static void main(String [] args){
			int a[][]={
			{1,2,3,4,0,3},
			{5,6,7,8,8,2},
			{9,1,7,6,7,1},
			{7,6,8,1,6,0},
			{2,4,6,8,5,0},
			{2,4,6,8,5,0},
			};
			int z=a.length;
			int q=z;
			System.out.println("z is:"+z);
			for(int i=0;i<=a.length;i++){
				if(q==a.length){
					int j=a.length-1;
					while(j>=0){
						System.out.println(a[j][0]);
						j--;
						z--;
						q--;
					}
					z++;
				}else if(z!=a.length){
					System.out.print(a[i][z]+"  ");
					z++;
				}else if(z==a.length){
					System.out.println();
					--z;
					for(int j=a.length-2;j>=0;j--){
						System.out.println(a[j][z]);
					}
				}
			}
		}
}