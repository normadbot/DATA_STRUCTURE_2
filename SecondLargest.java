import java.lang.*;
import java.util.*;
public class SecondLargest{
		public static void main(String [] args){
			int a[]={24,51,64,1,75,105,41,2};
			int fmax=a[0];
			int smax=a[0];
			for(int i=0;i<a.length;i++){
				if(a[i]>fmax){
					smax=fmax;
					fmax=a[i];
				}
			}
			System.out.println(fmax);
			System.out.println(smax);
		
		}
}


// for(int i=0;i<a.length;i++){
	// a[i]=s.nextInt(1);
// }