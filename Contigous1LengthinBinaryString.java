import java.lang.*;
import java.util.*;
public class Contigous1LengthinBinaryString{
		public static void main(String [] args){
			String s3="011010111101001";
			String s2="001101011";
			String s1="00111";
			int c1=0,c2=0;
			int x=0;
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)=='1'){
					c1++;
				}					
				if(s1.charAt(i)=='0'){
					if(c1>x){
						x=c1;
						c1=0;
					}
					else if(x>c1){
						c2=x;
						x=0;
						c1=0;
					}
				}
				if(i==s1.length()-1){
					if(x>c2){
						System.out.println(x);
					}else if(c2>x){
						System.out.println(c2);
					}else{
						System.out.println(c1);
					}
				}
			
			}
		}
}	