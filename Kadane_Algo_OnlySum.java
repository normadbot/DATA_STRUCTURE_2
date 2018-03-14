import java.lang.*;
import java.util.*;
public class Kadane_Algo_OnlySum{
	public static void main(String [] args){
		int a[]={-2,-5,6,-2,-3,1,5,-6};
		int max_current=a[0];
		int max_global=a[0];
		for(int i=0;i<a.length;i++){
			max_current=Math.max(a[i],a[i]+max_current);
			if(max_current>max_global){
				max_global=max_current;
			}
		}
		System.out.println(max_global);
	}
}