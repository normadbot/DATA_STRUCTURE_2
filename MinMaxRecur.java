import java.lang.*;
import java.util.*;
public class MinMaxRecur{
	public int[] MinMax(int beg,int end,int []a,int min,int max){
		 int res[]= new int[2];
		int max1,min1;
		if(beg==end){
			return min;
		}
		else if(beg==end-1){
			if(a[beg]>a[end]){
				this.max=a[beg];
				
				
			}
			else{
				this.min=a[end];
				return min;
			}
		} else{
			int mid=(beg+end)/2;
			MinMax(beg,mid,a,min,max);
			MinMax(mid+1,end,min,max);
			if(this.max<max1){
				this.max=max1;
				
			}
			if(this.min<min1){
				this.min=min1;
			}
			res[0]=this.max;res[1]=this.min;
			return res;
		}
		
	   
		 
		
		
	
	}
	public static void main(String [] args ){
		Scanner s = new Scanner(System.in);
		MinMaxRecur ab =new MinMaxRecur();
		System.out.println("enter the size of array ");
		int n= s.nextInt();
		System.out.println("Enter elements");
		int [] a= new int[n];
		for(int j=0;j<n;j++){
			a[j]=s.nextInt();
		}	
		int min=a[0],max=a[0];
		ab.MinMax(0,n-1,a,min,max); 
	}
}