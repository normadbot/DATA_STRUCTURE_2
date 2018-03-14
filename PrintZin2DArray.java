import java.lang.*;
import java.util.*;
class PrintZin2DArray{
	public static void main(String [] args){
		int a[][]={
		{1,2,3,4,0},
		{5,6,7,8,8},
		{9,1,7,6,7},
		{7,6,8,1,6},
		{2,4,6,8,5}};
		
		int z=-1;
		for(int i=0;i<a.length;i++){
			if(z==-1){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+" ");
					z++;
				}
				System.out.println();
				z--;
			}
			else if(z!=0){
				System.out.println(a[i][z]+" ");
				z--;
			}else if(z==0){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}
}