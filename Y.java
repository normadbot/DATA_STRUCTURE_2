import java.lang.*;
import java.util.*;
class X{

}
public class Y extends X{
		public static void main(String [] args ){
			X x= new X();
			Y y=(Y)x;//type cast exception
		}
}