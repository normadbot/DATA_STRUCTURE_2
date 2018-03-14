import java.lang.*;
import java.util.*;
public class SubsetsOfSizeKinArray{
		public static void main(String [] args){
			int a[]={1,2,3,4,5};
			boolean b[]= new boolean[5];
			subset(a,3,0,0,b);
		}
		static void subset(int a[],int k,int start,int currentp,boolean b[]){
			if(currentp==k){
			//	int sum1=0,sum2=0;
				for(int i=0;i<a.length;i++){
					if(b[i]==true){
						System.out.print(a[i]+"  ");
					}
				}
				System.out.println();
				return;
			}
			if(start==a.length){
				return;
			}
			
			b[start]=true;
			subset(a,k,start+1,currentp+1,b);
			b[start]=false;
		//	System.out.println("start:"+start+" Current:"+currentp);
			subset(a,k,start+1,currentp,b);
		}
}
