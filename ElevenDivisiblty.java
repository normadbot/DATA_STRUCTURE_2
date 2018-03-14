import java.lang.*;
import java.util.*;
import java.math.*;
public class ElevenDivisiblty{
		public static void main(String [] args )throws NumberFormatException{
				Scanner s = new Scanner(System.in);
				System.out.println("Enter Any number to check Divisiblty by ELEVEN(11)");
				BigInteger big = new BigInteger(s.next());
				String str=big.toString();
				int len= str.length(),even=0,odd=0;
				for(int i=0;i<len;i++){
					if(i%2==0 || i==0){
						 even=even+Character.getNumericValue(str.charAt(i));
					}
					else{
						 odd=odd+Character.getNumericValue(str.charAt(i));
					}
				}
				int check=even-odd;
				if(check%11==0){
					System.out.println("Yes Divisible by 11 ");
				}else{
					System.out.println("Not Divisible by 11 ");
				}
		}
}