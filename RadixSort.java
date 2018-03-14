import java.lang.*;
import java.util.*;
public class RadixSort {
		static int  getone(int a,int i){
			int b=a%i;
			return b;
		}
		
		
		public static void main(String [] srgs ){
			Scanner s = new Scanner(System.in);
			System.out.println("enter the size of array");
			int n= s.nextInt();
			System.out.println("enter the elements of array");
			int a[]= new int[n];
			for(int x=0;x<n;x++){
				a[x]=s.nextInt();
			}
			int div=10;
			for(int i=0;i<n;i++){
				for(int j=0;j<n-1;j++){
					if(getone(a[i],div)<getone(a[j],div)){
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
				div=div*10;
			}
			
		for(int y=0;y<n;y++){
			System.out.print(a[y]+" ");
		}		
			
		}
}