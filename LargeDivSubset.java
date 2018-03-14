import java.lang.*;
import java.util.*;
public class LargeDivSubset{
		public static void main(String [] args){
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the size of the Array");
			int n=s.nextInt();
			System.out.println("Enter the Elements of the Array");
			int a[]=new int[n];
			for(int x=0;x<n;x++){
				a[x]=s.nextInt();
			}				
			
			for(int y=0;y<n;y++){
				for(int z=0;z<n-1;z++){
					if(a[z]<a[z+1]){
						int t=a[z];
						a[z]=a[z+1];
						a[z+1]=t;
					}
				}
			}
			
			int b[]= new int[n];
				for(int i=0;i<n/2;i++){
					for(int j=n-1;j>=i;j--){
						if(a[i]%a[j]==0 ){
							b[j]=a[j];
							
						}
					}
					
					
				}
				System.out.println(Arrays.toString(b));
		}
}