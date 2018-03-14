import java.lang.*;
import java.util.*;
import java.util.HashSet;
public class LengthOfLongestContigousSubArray{
		public static void main(String [] args){
			int a[]={10, 12, 11};
			int b[]={14, 12, 11, 20};
			int c[]={1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
			int d[]={10, 12, 12, 10, 10, 11, 10};
			findLength(c);
			
		}
		static void findLength(int a[]){
			int c=0;
			int maxlen=1;
			for(int i=0;i<a.length-1;i++){
				HashSet<Integer>  s =new HashSet<>();
				s.add(a[i]);
				int maxel=a[i];int minel=a[i];
				for(int j=i+1;j<a.length;j++){
					if(s.contains(a[j]))break;
					s.add(a[j]);
					maxel=Math.max(maxel,a[j]);
					minel=Math.min(minel,a[j]);
					if((maxel-minel)==j-i){
						maxlen=Math.max(maxlen,(maxel-minel+1));
					}
				}
			}
			System.out.println(maxlen);
		}
}