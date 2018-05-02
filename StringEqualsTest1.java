import java.lang.*;
import java.util.*;
public class StringEqualsTest1{
		public static void main(String[] args) {
		String s1= new String("ABCD");
		String s2= new String("ABCD");
		String s3="ABCD";
		String s4="ABCD";
		if(s1.equals(s2)){
			System.out.println("its true");
		}
		
		if(s3==s4){
			System.out.println("HEree");
		}

		}
}