import java.lang.*;
import java.util.*;
import java.math.*;
public class BigIntegertoHexa1{
		public static void main(String[] args) {
			String dec="1111111111111111";
			BigInteger int1= new BigInteger(dec,10);
			String s=int1.toString(2);
			System.out.println(s);
		}
}