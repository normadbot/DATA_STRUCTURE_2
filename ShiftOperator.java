import java.lang.*;
import java.util.*;
public class ShiftOperator {
	static	void binary(int num){
			int re,a[x];
			if(num<=1){
				System.out.print(num);
				return;
			}
			System.out.println(num);
			re=num%2;
			binary(num>>1);
			//System.out.print(re);
		}
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter number to shift ");
			int num = s.nextInt();
			binary(num);
		}
}	