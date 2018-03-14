import java.lang.*;
import java.util.*;

public class Sqrt2 {
public static void main(String[] args) {
double result = getSqrt(Double.parseDouble(args[0]));
System.out.println("Answer: " + result);
}
public static double getSqrt(double number) {
double error = 1e-3;
double s = number;
while((s - number/s) > error) {
s = (s + number/s)/2;
System.out.println(s);
System.out.println("Current Error : " + (s - number/s));
}
System.out.println("Final Error : " + (s - number/s));
return s;
}
}