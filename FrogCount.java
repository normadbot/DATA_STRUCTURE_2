import java.util.*;
import java.lang.*;
class Frog{
	static int count=0;
	public Frog(){
		count++;
	}
}
public class FrogCount{
	public static void main(String [] args ) {
		 new Frog();
		 new Frog();
		 new Frog();
			System.out.println(Frog.count);
	
	}
}