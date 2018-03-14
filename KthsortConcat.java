import java.lang.*;
import java.util.*;
public class KthsortConcat{
	public static void main(String [] args){
		String s="banana";
		int k=10;
		String str="";
		for(int i=0;i<=s.length();i++){
			for(int j=i;j<=s.length();j++){
				str=s.substring(i,j);
				System.out.println(str);
				
			}
		}
	}
}
