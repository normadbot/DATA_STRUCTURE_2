import java.lang.*;
import java.util.*;
class Test implements Cloneable{
	private String s;
	private int y;
	Test(String s,int y){
		this.s=s;
		this.y=y;
	}
	void dostuff(){
		System.out.println("System is running");
	}
	protected Test clone()
		throws CloneNotSupportedException{
			return (Test)super.clone();
		
	}
}
public class ObjectCreationWays1 implements Cloneable{
	public static void main(String[] args)throws Exception {
		Test s1=new Test("Sarabjeet",21);
		Test s2=(Test)s1.clone();
		s2.dostuff();
	}
}