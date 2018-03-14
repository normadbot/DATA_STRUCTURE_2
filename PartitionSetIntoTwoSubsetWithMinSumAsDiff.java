import java.lang.*;
import java.util.*;
public class PartitionSetIntoTwoSubsetWithMinSumAsDiff{
	public static void main(String [] args){
		int a[]={23,45,-34,12,0,98,-99,4,189,-1,4};
		boolean b[]=new boolean[a.length];
		find(a,5,0,0,b);
		System.out.println(min);
	}
	static int min=999999;
	static void find(int a[],int k,int start,int curr,boolean b[]){
		if(curr==k){
			int sum1=0,sum2=0;
			for(int i=0;i<a.length;i++){
				if(b[i]==true){
					sum1+=a[i];
				}
			}for(int i=0;i<a.length;i++){
				if(b[i]==false){
					sum2+=a[i];
				}
			}
			int sub=sum1-sum2;
			if(sub>=0 &&min>sub){
				min=sub;
			}
			
		}
		if(start==a.length)return;
		
		b[start]=true;
		find(a,k,start+1,curr+1,b);
		b[start]=false;
		find(a,k,start+1,curr,b);
	}
}
