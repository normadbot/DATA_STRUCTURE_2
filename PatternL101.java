import java.lang.*;
import java.util.*;
public class PatternL101{
	public static void main(String[] args) {
		int n=10;

		for(int s=1;s<=2*n;s++){
			for(int j=2*n-1;j>=s;j--){
				System.out.print(" ");
			}
		if(s<=n){
			for(int i=1;i<=s;i++){
				System.out.print("* ");
			}
		}else{
			for(int i=1;i<=s-n;i++){
				System.out.print("* ");
			}
			for(int i=n;i>s-n;i--){
				System.out.print("  ");
			}
			for(int i=1;i<=s-n;i++){
				System.out.print("* ");
			}
		}

			System.out.println();
		}




	}
}