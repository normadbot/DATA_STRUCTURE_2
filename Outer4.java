import java.lang.*;

public class Outer4{
		private String x="Outer4";
		 void dostuff(){
			 final String name = "saby";
			 class Inner4{
						Inner4(){
					 System.out.println("Outer x is "+x);
					 System.out.println(name);
				 }
				 
			 }
			 Inner4 mi = new Inner4();//by just using constructor
			 
		 }
      public static void main(String [] args ){
		  
		  Outer4 o = new Outer4();
		  o.dostuff();
	  }

}