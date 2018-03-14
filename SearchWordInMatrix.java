import java.lang.*;
import java.util.*;
public class SearchWordInMatrix{
	public int [][] sol;
	int path=1;
	public SearchWordInMatrix(int N){
		sol = new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				sol[i][j]=0;
			}
		}
	}
	boolean search(char a[][],String s){
		int N=a.length;
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if(sear(a,s,i,j,0,N)) return true;
			}
		}
		return false;
	}
	boolean sear(char a[][],String s,int row,int col,int index,int N){
		if(sol[row][col]!=0 || s.charAt(index)!=a[row][col]){
			return false;
		}
		if(index==s.length()-1){
			sol[row][col]=path++;
			return true;
		}
		sol[row][col]=path++;
		if(row+1 <N && sear(a,s,row+1,col,index+1,N)){
			return true;
		}
		if(row-1>=0 && sear(a,s,row-1,col,index+1,N)){
			return true;
		}
		if(col+1 <N && sear(a,s,row,col+1,index+1,N)){
			return true;
		}
		if(col-1>=0 && sear(a,s,row,col-1,index+1,N)){
			return true;
		}
		if (row - 1 >= 0 && col + 1 < N	&& sear(a, s, row - 1, col + 1, index + 1, N)) {
			
			return true;
		}
		if (row - 1 >= 0 && col - 1 >= 0 && sear(a,s, row - 1, col - 1, index + 1, N)) {
			return true;
		}
		if (row + 1 < N && col - 1 >= 0 && sear(a, s, row + 1, col - 1, index + 1, N)) {
			return true;
		}
		if (row + 1 < N && col + 1 < N && sear(a,s, row + 1, col + 1, index + 1, N)) {
			return true;
		}

		
		sol[row][col] = 0;
		path--;
		return false;
	}
	void print(){
		for(int i=0;i<sol.length;i++){
			for(int j=0;j<sol.length;j++){
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String [] args){
		char a[][]={{'t','z','x','c','d'},
					{'a','h','n','z','x'},
					{'h','w','o','i','o'},
					{'o','r','n','r','n'},
					{'a','b','r','i','n'}};
			SearchWordInMatrix w = new SearchWordInMatrix(a.length);
			if(w.search(a,"horizon")){
				w.print();
			}else{
				System.out.println("Word Not Found");
			}
			
	}
}
