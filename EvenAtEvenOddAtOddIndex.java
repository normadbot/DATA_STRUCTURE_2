import java.lang.*;
import java.util.*;
public class EvenAtEvenOddAtOddIndex{
		public static void main(String [] args){
			int a[]={3,3,3,5,5,5,8,8,8,8,8,8};
			int x=0,y=1;
			while(x!=a.length-1 || y!=a.length-1){
				if((a[x]%2!=0 )&& (a[y]%2==0 )){
					int t=a[x];
					a[x]=a[y];
					a[y]=t;
					if(x==a.length-1 || y==a.length-1){
						System.out.println(Arrays.toString(a));
						break;
					}
					x=x+2;
					y=y+2;
				}
				if((a[x]%2==0)&&(a[y]%2==0)){
					x=x+2;
				}
				if((a[x]%2!=0)&&(a[y]%2!=0)){
					y=y+2;
				}
			}
		}
}
