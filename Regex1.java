import java.lang.*;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Regex1{
	public static void main(String[] args) {
		Pattern p= Pattern.compile("ab");
		Matcher m= p.matcher("abababababba");
		while(m.find()){
			System.out.print(m.start()+" ");
		}
	}
}