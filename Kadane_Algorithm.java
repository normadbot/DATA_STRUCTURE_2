import java.lang.*;
import java.util.*;
public class Kadane_Algorithm{
	public static void main(String [] args){
		int a[]={-2,-5,6,-2,-3,1,5,-6};
		int max_c=0;
		int sum=0;
		int start=0,end=0,s=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
				if(sum<0){
					sum=0;
					s=i+1;
				}
				if(sum>max_c){
					max_c=sum;
					start=s;
					end=i;
				}

		}
		System.out.println(max_c);
		
		for(int i=start;i<=end;i++){
			System.out.print(a[i]+" ");
		}
	}
}