import java.lang.*;
import java.util.*;
public class MinMax {
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the mumber of Elmements");
			int n= s.nextInt();
			System.out.println("Enter elements");
			int [] a= new int[n];
			for(int j=0;j<n;j++){
				a[j]=s.nextInt();
			}
			
			
			if(a[0]==a[n-1]){
				
				System.out.println("min and Max are:"+a[0]);
			}
			else{ int max=a[0],min=a[0];
					for(int i=1;i<n;i++){
						if(max<a[i]){
							max=a[i];
						}
						if(min>a[i]){
							min=a[i];
						}
				    }
					System.out.println("The Minimum is : "+min+" MAX is :"+max);
			}
		}
}