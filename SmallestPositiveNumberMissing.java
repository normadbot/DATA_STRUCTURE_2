import java.lang.*;
import java.util.*;
public class SmallestPositiveNumberMissing{
		public static void main(String [] args){
			int a[]={-10,0,-20,1,3};
			int b[]={1,2,3,4,5};
			int spos=9999;
			int bpos=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>0 && a[i]<spos){
					spos=a[i];
				}
				if(a[i]>0 && a[i]>bpos){
					bpos=a[i];
				}
			}
			System.out.println("spos= "+spos);
			System.out.println("bpos= "+bpos);
			spos=spos+1;
			int s=0;
			for(int i=0;i<a.length;i++){
				if(a[i]==spos){
					s++;
				}
				if(i==a.length-1){
					if(spos==bpos){
						System.out.println(spos+1);
						break;
					}
					if(s==0){
					//	System.out.println("s!=0 ");
						System.out.println(spos);
						break;
					}if(s!=0){
					//	System.out.println("s==0 ");
						spos=spos+1;
						s=0;
						i=0;
					}
					
				}
			}
		}
}
