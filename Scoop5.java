import java.lang.*;


public class Scoop5 {
static int thrower() throws Exception {return 42 ;}
public static void main(String [] args ) {
try {
  int x = thrower();
  } catch(Exception e) {
   x++;
  }finally {
  System.out.println("x = "+ ++x);
  }
}
}