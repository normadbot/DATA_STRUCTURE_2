import java.lang.*;
import java.util.*;
public class StringRotation{
	static void isSubstring(String a,String b){
		if(a.length()!=b.length()){
			System.out.print("Not a Rotation");
			return;
		}
		String s1="", s2="";
		for(int i=0,j=0;i<a.length()&&j<b.length();){
			if(a.charAt(i)!=b.charAt(j)){
				//System.out.println("Here i,j "+i+" "+j);
				s1=s1+a.charAt(i);
				i++;
			}else{
				//System.out.println("Here S2 i,j "+i+" "+j);
				s2=s2+b.charAt(j);
				j++;
				i++;
			}
		}
		if(s1.concat(s2).equals(a) || s1.concat(s2).equals(b)){
			System.out.print("Rotation");
		}else{
			System.out.print("No.Rotation");
		}
	}
		public static void main(String [] args){
			String a="ABACD";
			String b="CDABA";
			isSubstring(a,b);
		}
}
