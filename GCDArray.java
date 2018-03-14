import java.lang.*;
import java.util.*;
import java.util.Collections;
public class GCDArray{
		public static void main(String [] args){
			GCDArray a= new GCDArray();
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter The Size of the ");
			int n=sc.nextInt();
			Integer ar[]= new Integer[n];
			for(int i=0;i<n;i++){
				ar[i]=sc.nextInt();
			}
			Arrays.sort(ar,Collections.reverseOrder());
			
			a.GCDArray(ar);
		}
		void GCDArray(Integer ar[]){
		int	a=ar[0];
		int	b=ar[1];
			int r=999;
			while(r!=0){
				r=a%b;
				a=b;
				b=r;
		
			}
			int i1=a;
		
			for(int i=2;i<ar.length-1;i++){
				int x=1;
				int y=ar[i];
				while(x!=0){
					x=y%i1;
					y=i1;
					i1=x;
				}
				i1=y;
			}
			System.out.println("the GCD is "+i1);
			Integer s=1;
			for(Integer q:ar){
				s=s*q;
			}
			System.out.println("the LCM  is "+s/i1);
			
		}
}
