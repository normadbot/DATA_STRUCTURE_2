import java.lang.*;
import java.util.*;
public class Knapsack{
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the size of Array");
			int n = s.nextInt();
			System.out.println("Enter the weight and profit");
			double a[] = new double[n];
			double b[] = new double[n];
			for(int i=0;i<n;i++){
				System.out.println("Weight");
				a[i]=s.nextDouble();
				System.out.println("Profit");
				b[i]=s.nextDouble();
			}
			for(int j=0;j<n;j++){
				for(int k=0;k<n-1;k++){
					if((b[k]/a[k])<(b[k+1]/a[k+1])){
							double t1=a[k+1];
							a[k+1]=a[k];
							a[k]=t1;
							
							double t2=b[k+1];
							b[k+1]=b[k];
							b[k]=t2;
					}
				}
			}
			for(int y=0;y<n;y++){
				System.out.print("weight");
				System.out.print(a[y]+" ");
				System.out.print("profit");
				System.out.print(b[y]+" ");
				System.out.println();
			}
			System.out.println("The Size of Knapsack is 15Kg here: ");
			double c[]=new double[n];
			double tw=15;
			for(int v=0;v<n;v++){
				if((a[v])<tw){	
					c[v]=1;
					tw=tw-a[v];
				}
				else {
					 c[v]=tw/a[v];
					tw=0; 
				}
			}
			System.out.println(Arrays.toString(c));
			double ans =0;
			for(int x=0;x<c.length;x++){
				 ans=ans+c[x]*b[x];
			}
			System.out.println(ans);
		}
}		