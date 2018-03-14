import java.lang.*;
import java.util.*;
public class PrintKsizesubsets{
		public static void main(String [] args){
			int a[]={1,2,3,4,5};
			boolean []b=new boolean[a.length];
			subset(a,4,0,0,b);
		}		
		static void subset(int a[],int  k,int start,int currlen,boolean used[]){
			if(currlen==k){
				for(int i=0;i<a.length;i++){
						if(used[i]==true){
							System.out.print(a[i]+" ");
						}						
				}
				System.out.println();
				return;
			}
	if(start==a.length)return;
	
			used[start]=true;
			subset(a,k,start+1,currlen+1,used);
			used[start]=false;
			subset(a,k,start+1,currlen,used);
		
		}
}