import java.lang.*;
import java.util.*;
public class MaxDiffelafterlargerelement{
		public static void main(String [] args ){
			int b[]={2,3,10,6,4,8,1};
			int a[]={9,8,7,3,2};
			int min=999999;
			int max=a[0];
			int x=0,y=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>max){
					max=a[i];
					x=i;
				}
			}
			
			for(int i=0;i<=x;i++){
				if(a[i]<min){
					min=a[i];
				}
			}
			if(x==0){
				System.out.println("-1");
			}else
				System.out.println(max-min);
		}
}
