import java.lang.*;
import java.util.*;
public class SplitArray{
		public static void main(String [] args ){
			int a[]={1,2,3,4,5,5};
			int add=0;
			for(int i=0;i<a.length;i++){
				add+=a[i];
			}
			int pos=0;
			int b[]=new int[a.length];
			int sum1=0;
			for(int j=a.length-1;j>=0;j--){
				sum1+=a[j];
				b[j]=a[j];
				
				if(sum1==(add/2)){
					break;
				}
			}
			if(sum1!=(add/2)){
				System.out.println("not possible");
			}else{
            System.out.println(Arrays.toString(b));
			}
		}
}