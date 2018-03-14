
import java.lang.*;


public class Test { 

   public static void main(String args[]) {
      Integer x =Integer.valueOf("0101");
      Double c = Double.valueOf(5.125);
      Float a = Float.valueOf("80.0");               
      Integer b = Integer.valueOf("444",16);

      System.out.println(x); 
      System.out.println(c);
      System.out.println(a);
      System.out.println(b);
   }
}