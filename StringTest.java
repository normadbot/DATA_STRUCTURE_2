import java.lang.*;
import java.util.*;

public class StringTest{
	public static void main(String args [] ) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		String s3= "ABC";
		String s4= "ABC";
		
		System.out.println(s1==s2);
		
		System.out.println(s3==s3);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s3.equals(s4));
	
	}

}