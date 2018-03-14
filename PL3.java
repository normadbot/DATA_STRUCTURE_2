import java.util.*;
import java.lang.*;
class Base {
    public void foo() { System.out.println("Base"); }
}
  
class Derived extends Base {
    private void foo() { System.out.println("Derived"); } 
}
  
public class PL3 {												///It is compiler error to give more restrictive access to a derived
																	///class function which overrides a base class function.
    public static void main(String args[]) {
     //   Base b = new Derived();
      Derived b = new Derived();
        b.foo();
    }
} 