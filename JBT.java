import java.lang.*;
import java.util.*;
public class JBT{
		JBT(){
			this("Suck ?");
			System.out.println("This is Because i am an Engineer");
		}
		JBT(String str){
			System.out.println("Why Do You "+str);
		}
		public static void main(String [] args){
			JBT j = new JBT();
		}
}