import java.lang.*;
import java.util.*;
public class DigitToWordUptofourdig{
		public static void main(String [] args){
			DigitToWordUptofourdig a = new DigitToWordUptofourdig();
			int c=1234;
			int b=991;
			a.printWord(Integer.toString(b));
		}
		void printWord(String num){
			if(num.length()>4){
				System.out.println("The Length is more than 4");
				return;
			}
			String []numbers={"One","two","three","Four","Five","Six","Seven","eight","Nine"};
			String []power={"Thousand","Hundred"};
			String []tens={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
			String p="";
			int t=0;
			for(int i=num.length()-1;i>=0;i--){
				if(t==0){
					int n=Character.getNumericValue(num.charAt(i));
					if(n!=0){
						p=" "+numbers[n-1]+p;
					}
				}
				if(t==1){
					int n=Character.getNumericValue(num.charAt(i));
					if(n!=0){
						p=" "+tens[n-1]+p;
					}
				}
				if(t==2){
					int n=Character.getNumericValue(num.charAt(i));
					if(n!=0){
						p=" "+numbers[n-1]+" "+power[1]+p;
					}
				}
				if(t==3){
					int n=Character.getNumericValue(num.charAt(i));
					if(n!=0){
						p=" "+numbers[n-1]+" "+power[0]+p;
					}
				}
				t++;
			}
			System.out.println(p);
			
		}
}