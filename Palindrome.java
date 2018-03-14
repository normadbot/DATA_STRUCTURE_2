import java.lang.*;
import java.util.*;
import java.io.*;
public class Palindrome {
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String for Palindrome tset");
		String s = sc.nextLine();
		String r= "";
		for (int i=s.length()-1;i>=0;i--){
			r=r+s.charAt(i);
		}
		if(r.equals(s))
			System.out.println("this is sweet pussy ");
		else 
			System.out.println("this is Bad pussy ");
	}


}