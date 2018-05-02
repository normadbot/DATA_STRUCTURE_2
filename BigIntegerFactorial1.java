import java.lang.*;
import java.util.*;
import java.math.*;
public class BigIntegerFactorial1{
		public static void main(String[] args) {
			int n=100;
			BigInteger a= new BigInteger("1");
			for(int i=2;i<=n;i++){
				a=a.multiply(BigInteger.valueOf(i));
			}
			System.out.println(a.toString());
		}
}
