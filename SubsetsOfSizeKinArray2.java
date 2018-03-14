import java.lang.*;
import java.util.*;
public class SubsetsOfSizeKinArray2{
		public static void main(String [] args){
			int a[]={1,2,3,4,5};
			int b[]= new int[3];
			subset(a,3,0,0,b);
		}
		static void subset(int a[],int k,int start,int curr,int b[]){
			if(curr==k){
				System.out.println(Arrays.toString(b));
				return;
			}
			if(start>a.length-1)return;
			
			b[curr]=a[start];
			subset(a,k,start+1,curr+1,b);
			subset(a,k,start+1,curr,b);
			
		}
}
