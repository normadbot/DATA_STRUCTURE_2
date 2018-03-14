import java.lang.*;
import java.util.*;
public class SpiralMatrixMxN{
		public static void main(String [] arsg){
			int a[][]={ {1,2,3,4,5,6,2,0},
						{4,9,6,4,6,4,1,1},
						{7,8,2,4,6,9,3,3},
						{6,9,3,4,8,2,6,4},
				    	{7,7,8,9,9,3,7,4},
					    {2,1,3,4,5,6,7,9}};
			print(a,8,6);
		}
		static void print(int a[][],int R,int C){
			int Rs=0;
			int Re=R;
			int Cs=Rs+1;
			int Ce=C-1;
			int e=R*C;
			while(e>0){
				Cs=Rs+1;
				
				for(int i=Rs;i<Re;i++){
					System.out.print(a[Rs][i]+" ");e--;
				}if(e<=0)break;
				System.out.println();
				for(int j=Cs;j<Ce;j++){
					System.out.print(a[j][Re-1]+" ");e--;
				}
			    System.out.println();
				
				for(int i=Re-1;i>=Rs;i--){
					System.out.print(a[Ce][i]+" ");e--;
				}
				System.out.println();
				for(int j=Ce-1;j>=Cs;j--){
					System.out.print(a[j][Rs]+" ");e--;
				}
				Rs++;
				Re--;
				Ce--;
				System.out.println();
			}
		}
}