import java.lang.*;


public class Demo3 extends Demo2 {
 
  static {  System.out.println("This is demo3 static ");}
 public  Demo3(){System.out.println("This is demo3 Cons- ");}
 { System.out.println("This is demo3 initialsation block "); }
 
   public static void main(String [] args ) {
   
//   new Demo1();//not required
 //  new Demo2();//not required
   new Demo3();//as this will call Super() and all superclass constructors will be called
   
   
   
   }
 
 


}