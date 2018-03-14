import java.lang.*;
import java.util.*;
public class FourDivisibility{
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Number To check Divivsibility by 4 ");		
			String str= s.next();
			String s1="";
			for(int i=str.length()-2;i<str.length();i++){
				s1+=str.charAt(i);
			}
			if(Integer.parseInt(s1)%4==0){
							System.out.println(" yes Divivsible by 4 ");		
			}else{
			System.out.println(" NO Divivsible by 4 ");		
			}
		}
}