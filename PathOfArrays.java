import java.lang.*;
import java.util.*;
public class PathOfArrays{
	static void printpath(int a[][],int i,int j,ArrayList<Integer> path,ArrayList<ArrayList<Integer>> allpaths){
		if(i>=a.length || j>=a.length){
			return;
		}
		path.add(a[i][j]);
		if(i==a.length-1 && j==a.length-1){
			allpaths.add(path);
			return;
		}
		{
			
			printpath(a,i,j+1,new ArrayList<>(path),allpaths);
			printpath(a,i+1,j,path,allpaths);
		}
	}
	
	public static void main(String [] args){
	int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	int res[]=new int[a.length+a[0].length-1];	
		display(a);
		System.out.println();
		System.out.println();
		System.out.println();
	//	ArrayList<ArrayList<Integer>> allpaths = new ArrayList<>();
	//	printpath(a,0,0,new ArrayList<Integer>(),allpaths);    // Using ArrayList
	//	System.out.println(allpaths);
		
		printpath2(a,0,0,0,res);   //USing Arrays
	}
	
	static void printpath1(int a[][],int i,int j,int pos,int res[]){
		if(i==a.length-1 && j==a.length-1){
			res[pos]=a[i][j];
			System.out.println(Arrays.toString(res));
			return;
		}
		if(i>=a.length || j>=a.length)return;
		res[pos]=a[i][j];
		printpath1(a,i,j+1,pos+1,res);
		printpath1(a,i+1,j,pos+1,res);
	}
	static void display(int a[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
	static void printpath2(int a[][],int i,int j,int pos,int res[]){
		if(i>=a.length || j>=a.length)return;
		if(i==a.length-1 && j==a.length-1){
			res[pos]=a[i][j];
			System.out.println(Arrays.toString(res));
			return;
		}
		res[pos]=a[i][j];
		printpath2(a,i,j+1,pos+1,res);
		printpath2(a,i+1,j,pos+1,res);
	}
}
