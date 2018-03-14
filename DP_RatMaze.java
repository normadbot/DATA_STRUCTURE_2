import java.lang.*;
import java.util.*;
public class DP_RatMaze{
		public static void main(String [] args){
			DP_RatMaze a = new DP_RatMaze();
			int b[][]=new int[4][4];
			a.solve(b,4);
		}
		void solve(int a[][],int n){
			if(foundSol(a,0,0,n)){
				for(int i=0;i<a.length;i++){
					for(int j=0;j<a.length;j++){
						System.out.print(a[i][j]+ "  ");
					}
					System.out.println();
				}
			}else{
				System.out.println("No solution");
			}
		}
		boolean isSafe(int a[][],int x,int y,int n){
			if(x>=0 && x<n && y>=0 && y<n)return true;
			
			return false;
		}
		boolean foundSol(int a[][],int row,int col,int n){
			if(row==n-1 && col==n-1){
				a[row][col]=1;
				return true;
			}
			if(isSafe(a,row,col,n)){
				a[row][col]=1;
				if(foundSol(a,row+1,col,n))return true;
				if(foundSol(a,row,col+1,n))return true;
				
				a[row][col]=0;
				return false;
				
			}
			return false;
		}
}