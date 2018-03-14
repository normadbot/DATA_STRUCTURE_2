package packaging2;
import packaging1.package1; 
import java.lang.*;
import java.util.*;

public class package2 extends package1 {
	public void give(){
		System.out.println("printing message"+super.message());
	}
	public  static void main(String [] args ) {
		package2 a =  new package2();
		a.give();
		
	}
}