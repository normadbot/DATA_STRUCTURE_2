import java.lang.*;
import java.util.*;

public class SubSequence {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = sc.nextLine();
		System.out.println("Enter String 2");
		String s2 = sc.nextLine();
		String s3 = s1+s2;
		String s4 ="";
		for(int i=0;i<=s3.length();i++){
			for(int j=i+1;j<s3.length();j++){
				String s5 =(String) s1.subSequence(i,j);
				if(s1.regionMatches(i,s5,s3.length()))
					s4=s4+s5;			
				else 
					break;					
			}
			
		}
	
	}


}