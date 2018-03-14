import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ss = s.next();
        int l = s.nextInt();
        String max = ss.substring(0,l);
        String min = ss.substring(0,l);
      
        for(int i=1;i<ss.length()-l+1;i++)
        {
           if((max.compareTo(ss.substring(i,i+l)) < 0))
           {
              max = ss.substring(i,i+l);
           }
              
           if(min.compareTo(ss.substring(i,i+l)) > 0)
           {
              min = ss.substring(i,i+l);
           }
        }
      
        System.out.print(min + "\n" + max);
      
    }
}