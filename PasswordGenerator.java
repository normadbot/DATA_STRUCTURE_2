import java.lang.*;
import java.util.*;
public class PasswordGenerator{
		public static void main(String [] args){
			char  a[]={'a','s','y','b','2','7','7'};
			genrate(a,a.length);
		}
		static void genrate(char a[],int len){
			for(int i=1;i<=len;i++){
				form(a,i,"",len);
			}
		}
		static void form(char a[],int i,String s,int len){
			if(i==0){
				System.out.println(s);
				return;
			}
			for(int j=0;j<len;j++){	
			   String append=s+a[j];
			   form(a,i-1,append,len);
			}
			return;
		}
		
		
}
