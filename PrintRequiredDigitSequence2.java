import java.lang.*;
import java.util.*;
public class PrintRequiredDigitSequence2{
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a Integer ");
			int n=s.nextInt();
			int t=0;
			for(int i=100000;i<=999999;i++){
				String str=Integer.toString(i);
				int len=str.length();
				
				for(int j=0;j<len-1;j++){
					if(Character.getNumericValue(str.charAt(j))<Character.getNumericValue(str.charAt(j+1))){
						if(j==(len-2)){
							System.out.println(str);
							t++;
						}
					}else{
						break;
					}
				}
			}
			System.out.println("Total Count is :"+t);
		}
}
