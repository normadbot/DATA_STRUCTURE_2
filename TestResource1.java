import java.lang.*;
import java.util.*;
class Myresource implements AutoCloseable {
	public void close(){
		System.out.println("this is in my resources");
	}
}
public class TestResource1{
	public static void main(String []args ){
		try{
			return;
	    }
		finally{
			System.out.println("this is in Finally");
		}
	}
}