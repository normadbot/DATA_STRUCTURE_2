import java.lang.*;
import java.util.*;
public class MinimumNumberOfJumpsToReachTheEndofArray{
		public static void main(String [] args){
			int a[]={1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
			int n=minimumNumberOfJumps(a,0,a.length-1);
			System.out.println(n);
		}
		static int  minimumNumberOfJumps(int a[],int l,int h){
			if(a.length<=1)return 0;
			if(a[0]==0)return -1;
			
			int maxreach=a[0];
			int step=a[0];
			int jump =1;
			for(int i=1;i<a.length;i++){
				if(i==a.length-1)return jump;
				
				maxreach=Math.max(i+a[i],maxreach);
				step--;
				if(step==0){
					
					jump++;
					if(i>=maxreach)return -1;
					step=maxreach-i;
				}
			}
			return jump;
		}		
}