import java.lang.*;
import java.util.*;
public class HCFofArray{
		static public int GCD(int a,int b){
			if(b==0){
				return a;
			}
			return GCD(b,a%b);
		}
		public static void main(String [] args){
			int a[]={4,8,16,24,36};
			int r=a[0];
			for(int i=1;i<a.length;i++){
				r=GCD(r,a[i]);
			}
			System.out.println(r);
		}
}