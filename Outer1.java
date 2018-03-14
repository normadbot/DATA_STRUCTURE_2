import java.lang.*;

public class Outer1 {
	private int x=7;
		class Inner1{
			public void seeouter(){
				System.out.println("Outer x is :"+x);
				
			}
			
		}
	public static void main(String [] args){
		Outer1.Inner1 i = new Outer1().new Inner1();
		i.seeouter();			
	
	
	}

}