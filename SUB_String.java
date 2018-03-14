import java.lang.*;
import java.io.*;
import java.util.*;


public class SUB_String {
        
        public static void main(String [] args )throws Exception{
            Scanner sc = new Scanner(System.in);
            int count = str.length()%ir;
            int n =3;
			List<String> li = new LinkedList<String>();
           for(int i = 0 ;i<str.length();){
               li.add(str.substring(i,i+n));
                i+=3;
            }
			Collections.sort(li);
            System.out.println(str.substring(str.length()-count));
                
            
        }
}