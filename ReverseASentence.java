import java.lang.*;
import java.util.*;
public class ReverseASentence{
		public static void main(String [] args){
			String str="I.Love.MyCountry.VeryMuch";
			String wrd="";
			String sen="";
			for(int i=str.length()-1;i>=0;i--){
				if(str.charAt(i)!='.'){
					wrd=str.charAt(i)+wrd;
				}
				if(str.charAt(i)=='.'){
					sen=sen+wrd+str.charAt(i);
					wrd="";
				}
				if(i==0){
					sen=sen+str.charAt(i);
				}
			}
			System.out.println(sen);
		}
}
