import java.lang.*;
import java.util.*;
public class JBT4{
		JBT4(){
			
			System.out.println("This is Because i am an Engineer");
		}
		JBT4(String str){
			this();
			System.out.println("Why Do You "+str);
		}
		public static void main(String [] args){
			JBT4 j = new JBT4("Suck");
		}
}