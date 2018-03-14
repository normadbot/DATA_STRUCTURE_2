import java.lang.*;
import java.util.*;

  enum CoffeeSize{REGULAR,MEDIUM,LARGE}
public class Enum1 {
	
	CoffeeSize size=CoffeeSize.LARGE;
	
		public static void main(String [] args ){
			///CoffeeSize size;
				Enum1 drink= new Enum1();
				//drink.size=CoffeeSize.LARGE;
				System.out.println("The Size is "+drink.size);
		}
}