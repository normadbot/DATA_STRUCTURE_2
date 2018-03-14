import java.lang.*;

public class Hen {
 public static void main(String [] args ) {
   String s1="spring";
   String s2=s1+" Summer ";
   s1.concat(s1);
   s2.concat(s1);
   s1+=" Winter ";
   System.out.println(s1 + "  "+ s2);
 
 }

}