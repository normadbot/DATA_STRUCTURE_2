import java.lang.*;
import java.util.*;
public class NextGreaterNumber{
		static void getone(String str,int a,int b){
			System.out.println(str.substring(a,b));
		}
		public static void main(String [] args ){
			 System.out.println("Enter the number");
			 Scanner s =new Scanner(System.in);
			 String str=s.next();
			 for(int i=str.length()-1;i>0;i--){
				
				 if(Character.getNumericValue(str.charAt(i))>Character.getNumericValue(str.charAt(i-1))){
					 // System.out.println(str.charAt(i-1));
					 getone(str,i,str.length());
					  break;
				 }
			 }
		}
}