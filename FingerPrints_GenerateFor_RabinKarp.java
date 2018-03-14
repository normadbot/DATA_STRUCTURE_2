import java.lang.*;
import java.util.*;
public class FingerPrints_GenerateFor_RabinKarp{
	public static void main(String [] args){
			String text="GEEKSFORGEEKS";
			String pat="GEEKS";
	
		int m=pat.length()-1;
		double f=0;
		for(int i=0;i<pat.length();i++){
			
			f=(256*f+pat.charAt(i))*Math.pow(10,m--)%101;
		}
		System.out.println(f);

		int n=text.length()-1;
		int d=0;
		for(int i=0;i<text.length();i++){
			d+=256*text.charAt(i)*Math.pow(10,n--)%101;
		}
		System.out.println(d);
	}
}