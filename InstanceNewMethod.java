import java.lang.*;
import java.util.*;
class A{
	int a;
}
public class InstanceNewMethod{
	void doStuff()throws Exception{
		System.out.println("Here this is sarabjeet");
	}
	public static void fun(String c)throws Exception{
		Object obj =Class.forName(c).newInstance();
		System.out.println("Object Created for class "+	obj.getClass().getName());
		
	}
	public static void main(String[] args)throws Exception {
		fun("A");
	}
}