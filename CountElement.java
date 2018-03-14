import java.lang.*;
import java.util.*;
public class CountElement{
		public static void main(String [] args){
			Integer a[]= new Integer[]{5,4,2,2,5,4,6,4,6,7};
			
			int b[] = new int[a.length];
			for(int i=0;i<a.length;i++){
				int c=0;
				for(int j=0;j<a.length;j++){
					if(a[i]==a[j]){
						c++;
					}
				}
				
				
				int val=0;
				for(int k=0;k<b.length;k++){
					if(b[k]!=a[i]){
						
						b[k]=a[i];
						val=b[k];
						System.out.println("the Element"+b[k]+" Counts"+c);
						break;
					}
				}
						
				
				
			}
		
			
		
		}

}