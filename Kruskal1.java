import java.lang.*;
import java.util.*;
public class Kruskal1{
		static void mst(int a[][]){
			int pos=1,min,rep=0;
			int j;
			for(int i=0;i<a.length-1;i++){
				for( j=0;j<a.length-1;j++){
					min=9999;
					if(a[pos][j]<min && a[i][j]!=0 && rep!=j){
						min=a[i][j];
						pos=j;rep=i;
					}
				}
				System.out.print(j+"->");
			}
		}
	
		public static void main(String [] args){
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the weights of Edges-> ");
			System.out.println("Using Adjacency Matrix ");
			int [][]a={{0,5,15,10,0},{5,0,0,25,30},{15,0,0,20,0},{10,25,20,0,35},{0,30,0,35,0}};
			
			mst(a);
		
		}
}