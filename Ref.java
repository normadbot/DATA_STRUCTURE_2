import java.lang.*;


public class Ref {

 public Ref() {

 String  s="Fred";
 String t=s;
String d= t.toUpperCase();

 System.out.println(d);
 System.out.println(s);
 
 }

 
 public static void main(String [] args) {
 
 Ref a = new Ref();
 
 
 }
}