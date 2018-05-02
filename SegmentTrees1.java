import java.lang.*;
import java.util.*;
public class SegmentTrees1{
		public static void main(String[] args) {
			int a[]={1,3,5,7,9,11};
			int t[]=new int[50];
			int x=0;
			for(int i=0;i<a.length;i++){
				t[2*a.length+i]=a[i];
				x=2*a.length+i;
			}
			for(int i=x-1;i>0;i--){
				t[i]=t[i<<1]+t[i<<1|1];
			}
			System.out.println(Arrays.toString(t));
		}
}