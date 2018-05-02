import java.lang.*;
import java.util.*;
class Base{
	protected static int var=1;
	Base(){
		var+=10;
	}
	int getVar(){	
		return var;
	}
}
class Derived extends Base{
	void addValue(){
		System.out.println("ajsks");
		var+=10;
	}
	int getVar(){	
		return var;
	}
}
public class TestingInheritance1{
	public static void main(String[] args) {
		//Base b= new Base(5);

		Derived a= new Derived();
		System.out.println(a.getVar());
		
	}
}
