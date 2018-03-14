import java.lang.*;
import java.util.*;
public class SumOfSubset1{
		static void init(int a[]){
			for(int i=0;i<a.length;i++){
				a[i]=0;
			}
		}
		public static void main(String [] args){
			int [] b= new int[5];
			int a[]={5,1,4,3,6};
			for(int i=0;i<25;i++){
				init(b);
				int temp=i;
				int t=0;
				for(int j=0;j<5;j++){
					if(temp%2==1){
						b[t++]=1;
					}else{
						b[t++]=0;
					}
					temp=temp/2;
				}
				
				int sum=0;
				String sums=" ";
				for(int x=0;x<5;x++){
					if(b[x]==1){
						sum+=a[x];
						sums+=Integer.toString(a[x])+" ";
					}
				}
				if(sum==9){
					System.out.println(sums);
				}
				
				
			}
		}
}