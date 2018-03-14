import java.lang.*;
import java.util.*;

class Base {
    public static void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public static void show() {
       System.out.println("Derived::show() called");
    }
}
  
class PL1 {
    public static void main(String[] args) {
        Derived b = new Base();   ///Derived b = new Derived();//Derived::show() called//
       //Base b=new Derived();
		b.show();					///Base b = new Derived();	////Base::show() called//
    }
}