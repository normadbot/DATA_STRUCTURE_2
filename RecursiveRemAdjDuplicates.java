import java.lang.*;
import java.util.*;
public class RecursiveRemAdjDuplicates{
		public static void main(String [] ags ){
				String s1="zyxxy";
				String s2="geekforgeeks";
				String s3="caaabbbaacdddd";
				String str=removedup(s1); 
				System.out.print(str);
		}
	static	String removedup(String str){
			String s="";
			for(int i=0;i<str.length()-1;i++){
				if(str.charAt(i)!=str.charAt(i+1)){ 
					s+=str.charAt(i);
				}else{
					++i;
					s+=str.charAt(i);
				}
			}
			return s;
		}
}
