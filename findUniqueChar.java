import java.lang.*;
import java.util.*;
public class findUniqueChar{
	static boolean check(String str){
		boolean charset[]= new boolean[256];
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);
			if(charset[val]) return false;
			charset[val]=true;
			
		}
		return true;
	}
	public static void main(String [] args){
		String str="abcdh";
		boolean b = check(str);
		System.out.print(b);
	}
}	
