import java.lang.*;
import java.util.*;
public class SubsetOfArray{
		public static void main(String [] args){
			int a[]={1,2,3,4,5};
			int b[]=new int[a.length];
			subset(a,0,b);
		//	formBinary(b,0);
		}
		static void formBinary(int b[],int k){
			if(k==b.length-1){
				b[k]=0;
				System.out.println(Arrays.toString(b));
				b[k]=1;
				System.out.println(Arrays.toString(b));
				return;
			}
			b[k]=0;
			formBinary(b,k+1);
			b[k]=1;
			formBinary(b,k+1);
		}
		static void subset(int a[],int k,int b[]){
			if(k==a.length-1){
				b[k]=0;
				
				for(int i=0;i<a.length;i++){
					if(b[i]==1){
						System.out.print(a[i]+ " ");
					}
				}
				System.out.println();
				b[k]=1;
				for(int i=0;i<a.length;i++){
					if(b[i]==1){
						System.out.print(a[i]+ " ");
					}
				}
				System.out.println();
				return;
			}			
			b[k]=0;
			subset(a,k+1,b);
			b[k]=1;
			subset(a,k+1,b);
		}
}