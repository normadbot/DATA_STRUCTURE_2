import java.lang.*;
import java.util.*;
enum CoffeeSize{
	BIG(10),LARGE(30),MEDIUM(20);
	private int ounces;
	CoffeeSize(int ounces){
		this.ounces=ounces;
	}
	public int getounces(){
		return ounces;
	}
	
}

public class Enum2 {
	CoffeeSize size;
		public static void main(String [] args ){
			Enum2 e1 = new Enum2();
			Enum2 e2 = new Enum2();
			Enum2 e3 = new Enum2();
			
			e1.size = CoffeeSize.BIG;
			e2.size = CoffeeSize.LARGE;
			e3.size = CoffeeSize.MEDIUM;
			
			System.out.println(e1.size.getounces());
			for(CoffeeSize cs :CoffeeSize.values()){
				System.out.println(cs+" "+cs.getounces());
			}
			
		
		}
}