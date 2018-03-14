import java.lang.*;
import java.util.*;
public class KMP_PrefixArray{
		public static void main(String[] args){
			String str="aabaabaaa";
			char a[]=str.toCharArray();
			int b[]= new int[a.length];
			b[0]=0;
			for(int i=1,j=0;i<a.length;){
				while(a[i]!=a[j] && j>0){
					j=b[j-1];
				}
				if(a[i]==a[j]){
					b[i]=j+1;
					i++;
					j++;
				}else{
					b[i]=j;
					i++;
				}
				
			}
			System.out.println(Arrays.toString(b));

		}
}