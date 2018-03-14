import java.lang.*;
import java.util.*;
public class HCFandLCM{
		public static void main(String [] args){
			HCFandLCM a= new HCFandLCM();
			Scanner sc= new Scanner(System.in);
			int n=sc.nextInt();
			int ar[] = new int[2*n];
			System.out.println("Enter The Numbers");
			for(int i=0;i<2*n;i++){
				ar[i]=sc.nextInt();
			}
			a.HCFandLCM(ar);
			
		}
		void HCFandLCM(int ar[]){
			for(int i=0;i<ar.length-1;i=i+2){
				int a,b;
				if(ar[i]>ar[i+1]){
					a=ar[i];
				}else{
					b=ar[i+1];
					a=ar[i+1];
					b=ar[i];
				}
				int r=99999;
				while(r!=0){
					r=a%b;
					a=b;
					b=r;
					
				}
				System.out.println("The HCF of "+ar[i]+" and "+ar[i+1]+" is "+a);
				System.out.println("The LCM of "+ar[i]+" and "+ar[i+1]+" is "+(ar[i]*ar[i+1])/a);
				
			}
		}
		
}