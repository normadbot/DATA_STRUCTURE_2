import java.lang.*;

public class Outer3{
		private String x="Outer3";
		 void dostuff(){
			 class Inner3{
				 public void seeouter(){
					 System.out.println("Outer x is "+x);
				 }
				 
			 }
			 Inner3 mi = new Inner3();
			 mi.seeouter();
		 }
      public static void main(String [] args ){
		  
		  Outer3 o = new Outer3();
		  o.dostuff();
	  }

}