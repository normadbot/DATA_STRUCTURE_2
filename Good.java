import java.lang.*;


public class Good {
   public int length = 100;
  
 public void increment(Good obj) {
  
  obj.length=obj.length+1;
  System.out.println(obj.length);
  
 }
 public static void main(String [] args) {
 Good c = new Good();
  System.out.println("The length before increment is ="+c.length);
  c.increment(c);
  System.out.println("The length after increment is ="+c.length);
 
 }

}