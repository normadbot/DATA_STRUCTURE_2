import java.lang.*;
import java.util.*;
public class JBT5{
	static	void met(){
			System.out.println("meth1");
		}
	static	String met(String s){
				return s;
		}
		
		public static void main(String [] args ){
			met();
			System.out.print(met("saby"));
		}
}