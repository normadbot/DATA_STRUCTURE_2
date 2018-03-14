import java.lang.*;
import java.util.*;
public class RemCharFromString{
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter String ");
			String str= s.next();
			String sum="";
			for(int i=0;i<str.length();i++){
				sum="";
				for(int j=0;j<str.length();j++){
					if(j==i){
						continue;
					}
					sum+=str.charAt(j);
				}
				System.out.println(sum);
			}
		}
}