import java.lang.*;
import java.util.*;
public class MaxProfitBuySellAtMostTwice{
		public static void main(String [] ags){
				int a[] ={10, 22, 5, 75, 65, 80};
				int i=0;
				int b[]=new int[8];
				int s[]=new int[8];
				int x=0,y=0;
				
				
					while(i<a.length-1){
						if(i==0 && a[i]<a[i+1]){
							b[y++]=i;
							i++;
							continue;
						}
						if(a[i]<a[i+1] && a[i]<a[i-1] ){
							b[y++]=i;
						}
						if(i==a.length-1 && a[i]<a[i-1]){
							b[y++]=i;
						}
						i++;						
					}
					i=1;
					while(i<a.length-1){
						if(a[i]>a[i+1] && a[i]>a[i-1]){
							s[x++]=i;
							
						}
						if(i==a.length-2 && a[i+1]>a[i]){
							s[x++]=i+1;
						}
						i++;
					}
					System.out.println(Arrays.toString(a));
					System.out.println(Arrays.toString(b));
					System.out.println(Arrays.toString(s));
				
		}
}