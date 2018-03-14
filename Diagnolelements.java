import java.lang.*;
import java.util.*;
public class Diagnolelements{
		public static void main(String [] args ){
			int a[][]= {{1,2,3,4},{5,6,7,8},{9,1,7,5},{3,4,1,9}};
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					System.out.print(a[i][j]+"   ");
				}
				System.out.println();
			}
			sum(a);
		}
}