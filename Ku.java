import java.lang.*;

public class Ku {
 public static void main (String [] args ) {
  StringBuilder sb = new StringBuilder("0123456789");
  sb.delete(4,6);
  System.out.println(sb);
 
 StringBuilder s = new StringBuilder(" Sarabt Singh ");
 s.insert(5,"jee ji");
 System.out.println(s);
 
 
 String x= "abc";
 String y = x.concat("def").toUpperCase().replace("C","x");
 System.out.println("y ="+y);
 
 
 }

}