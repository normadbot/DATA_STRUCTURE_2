import java.lang.*;
import java.util.*;
public class MinCoinExchange{
		public static void main(String [] args ) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the ammount");
			int am = sc.nextInt();
			int  t1=0,t2=0;;
			int d[] = {1,2,3,5};
			int a[]=new int[d.length];
			int b[]=new int[d.length];
			
			for(int j=0;j<d.length;j++)
						{b[j]=0;}
			for(int i=0;i<d.length;i++){
				a[i]=am/d[i];
				b[i]=am%d[i];
				
				
			}
			int min=a[0],min1=b[0];
			for(int u=1;u<a.length;u++){
				if(min>a[u]) {min=a[u];t1=u;}
			}
			for(int v=1;v<b.length;v++){
				if(min>a[v]) {min=a[v];t2=v;}
			}
			
			System.out.print("the change required To give ammount"+am+"is"+d[t1]+"and"+d[t2]);	
		}

}