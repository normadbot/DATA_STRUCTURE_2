import java.lang.*;
import java.util.*;
public class DP_LongestIncreasingSequence{
	public static void main(String [] args){
		int a[]={8,1,4,3,5,2,6,7};
		int b[]=new int[a.length];
		for(int i=0;i<b.length;i++){
			b[i]=1;
		}
		for(int i=1;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(a[i]>a[j]){
					if(b[i]<(b[j]+1)){
						b[i]=b[j]+1;
					}
				}
			}
		}
		int max=b[0];
		for(int i=0;i<b.length;i++){
			if(b[i]>max){
				max=b[i];
			}
		}
//		System.out.println(Arrays.toString(b));
		System.out.println(max);
		int ind=0;
		for(int i=0;i<b.length;i++){
			if(b[i]==max)ind=i;
		}
		int c=max;
		int res[]= new int[max];int t=0;
		for(int i=ind;i>=0;i--){
			if(b[i]==c){
				res[t++]=a[i];
				--c;
			}
		}
		for(int i=t-1;i>=0;i--){
			System.out.print(res[i]+" ");
		}
	}
}