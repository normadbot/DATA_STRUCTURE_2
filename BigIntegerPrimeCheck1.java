import java.lang.*;
import java.util.*;
import java.math.BigInteger;
public class BigIntegerPrimeCheck1{
		public static void main(String[] args) {
			BigInteger n= new BigInteger("6");
			BigInteger one= new BigInteger("1");
			while(!n.isProbablePrime(100)){
				n=n.add(one);
				System.out.println(n.toString()+" is probably prime ");
			}
		}
}