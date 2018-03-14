import java.lang.*;
import java.util.*;
public class DP_nQueen{
	public static void main(String [] args){
		DP_nQueen a = new DP_nQueen();
		int b[][]= new int[4][4];
		a.solve(b,4);
	}
	void solve(int a[][],int n){
		if(putQueen(a,0,n)){
			System.out.println();
				
			}else{
				System.out.println("No Solution Exist");
			}
		
	}
	boolean canPlace(int a[][],int row,int col){
			for(int i=0;i<a.length;i++){
				if(a[row][i]==1)return false;
			}
			for(int i=0;i<a.length;i++){
				if(a[i][col]==1)return false;
			}
			for(int i=row,j=col;i<a.length && j>=0;i++,j--){
				if(a[i][j]==1)return false;
			}
			for(int i=row,j=col;i>=0 && j>=0;i--,j--){
				if(a[i][j]==1)return false;
			}
		return true;
	}
	boolean putQueen(int a[][],int queenLoc,int n){
		if(queenLoc==n){
			
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();System.out.println();
			return true;
		}
		for(int row=0;row<n;row++){
			if(canPlace(a,row,queenLoc)){
				a[row][queenLoc]=1;
				if(putQueen(a,queenLoc+1,n)){
					//return true;
				}						// for only one Solution just return true with If condition After the putQueen(queenLoc+1,n)//
				a[row][queenLoc]=0;
			}
		}
		return false;
	}
}