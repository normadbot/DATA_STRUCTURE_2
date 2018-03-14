import java.lang.*;
import java.util.*;
public class QueenProblem1{
		public int [][] solution;
		public QueenProblem1(int N){
			solution= new  int[N][N];
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					solution[i][j]=0;
				}
			}
		}
		public void solve(int N){
			if(placequeen(0,N)){
				for(int i=0;i<N;i++){
					for(int j=0;j<N;j++){
						System.out.print(" "+solution[i][j]);
					}
					System.out.println();
				}
			}else{
					System.out.println("NO SOLUTION EXIST");
			}
		}
		public boolean placequeen(int queen, int N){
			if(queen==N){
				return true;
			}
			for(int row=0;row<N;row++){
				if(canPlace(solution,row,queen)){
					solution[row][queen]=1;
					if(placequeen(queen+1,N)){
						return true;
					}
					solution[row][queen]=0;
				}
			}
			return false;
		}
		public boolean canPlace(int matrix[][],int row, int column){
			for(int i=0;i<column;i++){
				if(matrix[row][i]==1){
					return false;	
				}
			}
			for(int i=row,j=column;j>=0 && i>=0;i--,j--){
				if(matrix[i][j]==1){
					return false;
				}
			}
			for (int i = row, j = column; i < matrix.length && j >= 0; i++, j--) {
				if (matrix[i][j] == 1) {
					return false;
				}
		}
		return true;
		}
		
		public static void main(String [] args ){
				int N=12;
				QueenProblem1 q  = new QueenProblem1(N);
				q.solve(N);
		}
}