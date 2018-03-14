import java.lang.*;
import java.util.*;
public class MinSubfromArraysdiffMaxEle{
		public static void main(String args[]){
			int a[]={20,24,100};
			int b[]={2,19,22,79,800,900};
			int c[]={10,12,23,24,119};
			int i=0,j=0,k=0;
			int pi=0,pj=0,pk=0;
			int diff=99999;
			while(i<a.length && j<b.length && k<c.length){
				int min=Math.min(a[i],Math.min(b[j],c[k]));
				int max=Math.max(a[i],Math.max(b[j],c[k]));
				
				if(max-min<diff){
					pi=i;pj=j;pk=k;
					diff=max-min;
				}
				if(diff==0)break;
				
				if(a[i]==min)i++;
				else if(b[j]==min)j++;
				else k++;
			}
			System.out.println(a[pi]);
			System.out.println(b[pj]);
			System.out.println(c[pk]);
		}

}