import java.lang.*;
import java.util.*;
import java.math.BigInteger;
public class BigIntegerImplementation2{
		public static void main(String[] args) {
			BigInteger int1= new BigInteger("123456789011111");
			int exp=2;
			int1=int1.pow(exp);
			System.out.println(int1);
			byte[] byt=new byte[]{0x1,0x00,0x00};
			byt =int1.toByteArray();
			System.out.println(Arrays.toString(byt));
			int1=int1.shiftLeft(3);
			System.out.println(int1);

		}
}