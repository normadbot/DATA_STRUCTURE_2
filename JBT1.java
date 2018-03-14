import java.lang.*;
import java.util.*;
public class JBT1{
		JBT1(){
			this("Suck ?");
			System.out.println("This is Because i am an Engineer");
		}
		JBT1(String str){
			this();///RECURSIVE CONSTRUCTOR INVOCATION ERROR //It calls again and again //
		}
		public static void main(String [] args){
			JBT1 j = new JBT1 ();
		}
}