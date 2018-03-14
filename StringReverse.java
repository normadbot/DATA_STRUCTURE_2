import java.lang.*;
import java.util.*;
public class StringReverse{
		
		public static void main(String [] args){
			String str="i am an INDIAN";
			String st="";
			String r="";
			for(int i=str.length()-1;i>=0;i--){
					if(str.charAt(i)!=' '){
						st=str.charAt(i)+st;
							
					} if(str.charAt(i)==' '){
						r=r+st+str.charAt(i);
						st="";	
					}
					if(i==0){
					r=r+st;
					}
			}
			System.out.print(r);
		}
}