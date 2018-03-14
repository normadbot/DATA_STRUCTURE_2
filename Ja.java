import java.lang.*;
public class Ja{
 public static void main(String [] args) {
	int x;
	long x2;
	Long [] La = { 4L,5L,6L};
	long [] la = {7L,8L,9L};
	int [][] twoDee ={{1,2,3},{4,5,6},{7,8,9}};
	String [] sNums = {"one ","two","three"};
	
	
	for(long y : la ){ System.out.println(y);}
	for(long lp :La ){ System.out.println(lp);}
	for(int[]  n : twoDee)
	{
		for(int n2 : n){
				System.out.println(n2);
		}
	}
	
	for(int [] n2 :twoDee){
		for (int k : n2){
		System.out.println(k);
		}
		}
	for(String s : sNums){System.out.println(s);};
	for (Object o : sNums ){System.out.println(o);};
	
  
 }


}