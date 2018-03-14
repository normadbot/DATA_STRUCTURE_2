import  java.lang.*;
import java.util.*;
import java.math.*;
public class ThreeDivisibility1{
			public static void main(String [] args){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter The Number you Want Check Divisibility By THREE(3): ");				
				String str = s.next();
				int sum=0;
				for(int i=0;i<str.length();i++){
					sum+=str[i];
				}
				if(sum%3==0){
					System.out.println("The Number "+big+" is Divivsible by 3");
				}else{
					System.out.println("The Number "+big+" is Not Divivsible by 3");
				}
				
			
			}
}