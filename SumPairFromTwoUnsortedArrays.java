import java.lang.*;
import java.util.*;
import java.util.HashMap;
public class SumPairFromTwoUnsortedArrays{
		public static void main(String [] args){
			int a[]={1,4,5,6,8,2,7};
			int b[]={2,7,6,3,8};
			int k=9;
			HashMap<Integer,Integer>  h = new HashMap<Integer,Integer>();
			for(int i=0;i<a.length;i++){
				h.put(i,a[i]);
			}
			for(int i=0;i<b.length;i++){
				if(h.containsKey(k-b[i])){
					System.out.println(b[i]+" "+(k-b[i]));
				}
			}
		}
}