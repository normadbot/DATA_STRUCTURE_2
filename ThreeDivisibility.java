import  java.lang.*;
import java.util.*;
import java.math.*;
public class ThreeDivisibility{
			public static void main(String [] args){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter The Number you Want Check Divisibility By THREE(3): ");
				BigInteger big = new BigInteger(s.next());
				String str = big.toString();
				int sum=0;
				for(int i=0;i<str.length();i++){
					sum+=Character.getNumericValue(str.charAt(i));
				}
				if(sum%3==0){
					System.out.println("The Number "+big+" is Divivsible by 3");
				}else{
					System.out.println("The Number "+big+" is Not Divivsible by 3");
				}
				
			
			}
}