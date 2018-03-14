import java.util.Scanner;
public class Sqrt {
 
 public void getTheSqrt( int n )
 {
  // double a = (eventually the main method will plug values into a)
  double a =  n;
  double x = 1;
 
  // For loop to get the square root value of the entered number.
  for( int i = 0; i <n ; i++)
  {
   x = 0.5 * ( x+a / x );
  }
 
  System.out.println("sqrt of " + a + " is " + x);
 }
 
 // Begin method main..
 public static void main(String[] args) {
  // Creating an object from "Scanner" to input data.
  Scanner Sa = new Scanner(System.in);
  Sqrt S = new Sqrt();
 
  //Asking the user to input the number we want to find its square root.
  System.out.println("Enter n: ");
  int n = Sa.nextInt();
 
  // Calling the method that'll calculate the square root of the given number.
  S.getTheSqrt( n );
 
 } // End method main
 
}
