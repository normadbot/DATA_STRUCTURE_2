import java.lang.*;
import java.util.*;
public class RemoveDupSorted{
	static	int a [] = {1,2,2,3,8,8,3,3,3,4,5,9,11,11,111,111};
	static int b[]= new int [a.length];
		static boolean check(int c){
		int f=0;
		for(int i=0;i<b.length;i++){
				f=0;
				if(b[i]==c){
					f++;
					break;
				}
			}
			if(f==0){
				return false;
			}else{
				return true;
			}
		}
		
		public static void main(String [] args ){
			int l=0;
			boolean t=true;
			int c=0,f=0,s=0;
			for(int i=0;i<a.length;i++){
				f=0;
				c=a[i];
				t =check(c);
				System.out.print(" "+t);
				System.out.println();
				
				if(t==false){
					b[l++]=c;
				}
				
				
				}
			
			System.out.println(Arrays.toString(b));
			}
		}
		

