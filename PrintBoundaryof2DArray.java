import java.lang.*;
import java.util.*;
public class PrintBoundaryof2DArray{
		public static void main(String [] args){
			int a[][]={
			{1,2,3,4,0,3},
			{5,6,7,8,8,2},
			{9,1,7,6,7,1},
			{7,6,8,1,6,0},
			{2,4,6,8,5,0},
			{2,4,6,8,5,0},
			};
			int z=-1,q=0;
			for(int i=0;i<a.length;i++){
									
				if(z==-1){
					for(int j=0;j<a.length;j++){
						z=0;
						System.out.print(a[0][j]+" ");
					}
				}
				else if(z!=a.length){
					System.out.println(a[i][a.length-1]);
					++z;
					//System.out.println("Z iHEREs"+z);
					if(z==a.length-1){
						for(int j=a.length-1;j>=0;j--){
						System.out.print(a[a.length-1][j]+" ");
						}
						for(int j=a.length-1;j>=0;j--){
						System.out.println(a[j][0]);
						}		
					}
				}
			//	
			}
		}
}