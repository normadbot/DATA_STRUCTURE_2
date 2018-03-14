import java.lang.*;
import java.util.*;
public class Xor1{
		static int findodd(int a[],int n){
				int res=0,i;
				for(i=0;i<n;i++){
					res^=a[i];
				}
				return res;
		}
		public static void main(String [] args ){
			int a[]={12,12,14,90,14,14,14};
			Integer n=(a.length/a[0].length);
			System.out.println("The Odd Occuring Element"+findodd(a,n));
			return ;
		}
}