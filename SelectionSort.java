import java.lang.*;
import java.util.*;
public class SelectionSort {
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("enter the size of array");
			int n= s.nextInt();
			System.out.println("enter the elements of array");
			int a[]= new int[n];
			for(int x=0;x<n;x++){
				a[x]=s.nextInt();	
			}
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					if(a[i]>a[j]){
						int t=a[i];
						a[i]=a[j];
						a[j]=t;
					}
				}
			}
			for(int y=0;y<n;y++){
				System.out.print(" "+a[y]);
			}
			
		}
}