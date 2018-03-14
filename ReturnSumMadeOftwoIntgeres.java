import java.lang.*;
import java.util.*;
public class ReturnSumMadeOftwoIntgeres{
		public static void main(String [] args){
			int a[]={2,4,1,6,2,7,4};
			int k=8;
			boolean b[]=new boolean[100];
			for(int i=0;i<a.length;i++){
				int t=k-a[i];
				if(t>=0 && b[t]){
					System.out.println("The Pair is "+t+"  "+a[i]);
					//break;
				}
				b[a[i]]=true;
			}
		}
}