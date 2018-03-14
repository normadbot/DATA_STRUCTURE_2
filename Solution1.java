import java.io.*; import java.util.*;
public class Solution1+ {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s = in.next();
    int num = in.nextInt();
    in.close();
    List<String> li=new ArrayList<String>();
    for(int i=0;i<=s.length()-num;i++){
        li.add(s.substring(i,i+3));
    }
    Collections.sort(li);
    System.out.println(li.get(0));
    System.out.print(li.get(li.size()-1));
}
}