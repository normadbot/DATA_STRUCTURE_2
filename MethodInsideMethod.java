import java.lang.*;
import java.util.*;
public class MethodInsideMethod{
		static void pass(String s1){
			pass1(s1);
		}
		static void pass1(String s2){
			System.out.println(s2);
		}
		
		
		public static void main(String [] args){
		String s1 = "Hello";
		pass(s1);			
		}
}
