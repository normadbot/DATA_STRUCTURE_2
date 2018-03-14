import java.lang.*;


public class Input {

 public static void main (String [] args ) {
 String s ="-";
 try {
 doMath(args[0]);
 s+="t";
 }
 finally {
 System.out.println(s+="f");}
 
 
 }
 public static void  doMath(String a){
	 int y = 7/Integer.parseInt(a);
 }
}