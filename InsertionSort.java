import java.lang.*;
import java.util.*;
public class InsertionSort{
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter The Size of Array");
			int n = s.nextInt();
			System.out.println("Enter The Elements");
			int a[]=new int[n];
			for(int x=0;x<n;x++){
				a[x]=s.nextInt();
			}
			int j;
			for(int i=1;i<a.length;i++){
				j=i-1;
				while(i>0 && a[j]>a[i]){
				int	temp = a[i];
                a[i] = a[j];
                a[j] = temp;
				i=j;
				j--;
				}
			  }
			
			
			for(int y=0;y<a.length;y++){
				System.out.print(" "+a[y]);
			}
		
		}
}