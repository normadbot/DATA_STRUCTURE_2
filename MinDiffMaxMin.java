import java.lang.*;
import java.util.*;
public class MinDiffMaxMin {
			public static void main(String [] args ){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the Size of array");
				int siz= s.nextInt();
				int a[]= new int[siz];
				System.out.println("Enter the elements");
				for(int i=0;i<siz;i++){
					a[i]=s.nextInt();
				}				
				System.out.println("Enter K");
				int k=s.nextInt();
				int b[]=new int[k];
				int p=0,min=99999;
			l1:	for(int i=0;i<a.length;i++){
			
				l2:	for(int j=i;j<k-1;j++){
						b[j]=a[j];
						p=j;
						
					}
					b[++p]=a[++p];
					
				
					
				}
				
			
			}
}