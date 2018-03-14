import java.lang.*;
import java.util.*;
public class Flooring{
		public static void main(String [] args){
			int n=3;
			int r=n;
			int b=100;
			double s=0;
			int f=0;
			for(int i=1;i<=n;i++){
				while(b%r!=0 && r!=1){
					r--;
				}
				s=s+Math.pow(i,n)*(r);
				if(b%r==0 && r!=1)r--;
			}
			System.out.println(s);
		}
		
}