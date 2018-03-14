import java.lang.*;
import java.util.*;
public class StringToChar{
		public static void main(String [] args){
			String [] s = new String[]{"ilove you"};


int length = 0;
for (int i = 0; i < s.length; i++) {        
    for (int j = 0; j < s[i].length(); j++) {
        length++;
    }
}
System.out.println(length);

char [] c = new char[length];
int k = 0;
				for (int i = 0; i < s.length; i++) {        
					for (int j = 0; j < s[i].length(); j++) {
						c[k] = s[i].charAt(j);
						k++;
					}
				}
				
				
				for (int j = 0; j < c.length; j++) {
					System.out.print( 	 c[j]);
				}
		}
}