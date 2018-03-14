import java.lang.*;
import java.util.*;
public class OddOccurence{
		public static void main(String [] args){
			int a[]={2,3,5,7,5,7};
			int n=a.length;
			int res=0;
			for(int i=0;i<n;i++){
				res=res^a[i];
			}
			System.out.println(a[res]);
		}
}	