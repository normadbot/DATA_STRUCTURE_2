import java.lang.*;
import java.util.*;
public class DP_StairClimbingPuzzle{
		public static void main(String [] args){
			int num_stairs=4;
			int d[]= new int[10];
			int n=num_ways(num_stairs+1,d);
		//	int n=num_ways_1(num_stairs+1);
			System.out.println(n);
		}
		static int num_ways(int n,int d[]){
			if(n<=1)return 0;
			if(d[n]>0)return d[n];
			
			d[n]=1+num_ways(n-1,d)+num_ways(n-2,d);
			
			return d[n];
		}
		static int num_ways_1(int n){
			if(n<=1)return n;
			
			return num_ways_1(n-1)+num_ways_1(n-2);
			
		}
}