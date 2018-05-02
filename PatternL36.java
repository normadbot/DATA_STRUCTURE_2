import java.lang.*;
import java.util.*;
public class PatternL36{
	public static void main(String[] args) {
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++){
				for (int k=n;k>=i;k--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					System.out.print(x);
				}
				for(int l=1;l<i;l++){
					System.out.print(x);
				}
				x=x+2;
				System.out.println();
		}


	}
}