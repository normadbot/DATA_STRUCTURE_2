import java.lang.*;
import java.util.*;
public class PrintRequiredDigitSequence1{
		public static void main(String [] args ){
			//Scanner s = new Scanner(System.in);
			//System.out.print("Enter a Integer ");
			int n=3;int d=0;
			for(int i=100;i<=999;i++){
				String str=Integer.toString(i);
				int len=str.length();
				int t=0;
				if(t<len && Character.getNumericValue(str.charAt(t))<Character.getNumericValue(str.charAt(t+1))){
					t++;
					if(t<len && Character.getNumericValue(str.charAt(t))<Character.getNumericValue(str.charAt(t+1))){
						System.out.println(str);
						d++;
					}
				}
			}
			System.out.println("Total count is :"+d);
		}
}
