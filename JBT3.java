import java.lang.*;
import java.util.*;
public class JBT3{
		JBT3(){
			this();///recursive Constructor Invocation // calling itself again and again///
			System.out.println("This is Because i am an Engineer");
		}
		//JBT2(String str){
		//	System.out.println("Why Do You "+str);
		//}
		public static void main(String [] args){
			JBT3 j = new JBT3();
		}
}