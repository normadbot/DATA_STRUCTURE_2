import java.lang.*;
import java.util.*;
public class MatrixSpiralNxN{
	public static void main(String [] args){
	    int a[][]={{1,2,3,4,4},
				   {4,5,7,1,4},
				   {2,3,6,7,4},
				   {1,4,5,6,4},
				   {1,1,21,1,1}};
			print(a,5);
	}
	static void print(int a[][],int n){
		int Rs=0;
		int Re=n;
		int Cs=Rs+1;
		int Ce=Re-1;
		while(Re>(n/2)){
			Cs=Rs+1;
			Ce=Re-1;
			for(int i=Rs;i<Re;i++){
				System.out.print(a[Rs][i]+" ");
			}
			
			for(int j=Cs;j<Ce;j++){
				System.out.print(a[j][Ce]+" ");
			}
			if(Rs==Re-1)break;
			
			for(int i=Re-1;i>=Rs;i--){
				System.out.print(a[Ce][i]+" ");
			}
			
			for(int j=Ce-1;j>=Cs;j--){
				System.out.print(a[j][Rs]+" ");
			}
			
			Re--;
			Rs++;
		}
	}
}