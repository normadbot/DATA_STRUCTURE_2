import java.lang.*;
import java.util.*;
public class DP_Knights{
	int path=0;
	void solve(int a[][],int n){
		if(canKnightPlace(a,0,0,0,n)){
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(a[i][j]+"      ");
				}
				System.out.println();
			}
		}else{
			System.out.println("No existing Solution");
		}
	}
	boolean validLoc(int row,int col,int n){
		if(row>=0 && col>=0 && row<n && col<n)return true;	
		return false;
	}
	boolean canKnightPlace(int [][]a,int row,int col,int index,int n){
		if(a[row][col]!=0){
			return false;
		}
		a[row][col]=path++;
		if(index==n*n-1){
			return true;
		}
		if(validLoc(row+2,col+1,n)&&canKnightPlace(a,row+2,col+1,index+1,n))return true;
		if(validLoc(row+1,col+2,n)&&canKnightPlace(a,row+1,col+2,index+1,n))return true;
		if(validLoc(row-1,col+2,n)&&canKnightPlace(a,row-1,col+2,index+1,n))return true;
		if(validLoc(row-2,col+1,n)&&canKnightPlace(a,row-2,col+1,index+1,n))return true;
		if(validLoc(row-2,col-1,n)&&canKnightPlace(a,row-2,col-1,index+1,n))return true;
		if(validLoc(row-1,col-2,n)&&canKnightPlace(a,row-1,col-2,index+1,n))return true;
		if(validLoc(row+1,col-2,n)&&canKnightPlace(a,row+1,col-2,index+1,n))return true;
		if(validLoc(row+2,col-1,n)&&canKnightPlace(a,row+2,col-1,index+1,n))return true;
		
		a[row][col]=0;
		path--;
		return false;
		
	}
	
		public static void main(String [] args){
			DP_Knights a = new DP_Knights();
			int b[][]= new int[8][8];
			a.solve(b,8);
		}
}