import java.lang.*;
import java.util.*;
public class PatternL82{
	public static void main(String[] args) {
		int n=10;

			for(int i=1;i<=n;i++){
					for(int j=1;j<=i;j++){
						if(j==i)System.out.print("*");
						else System.out.print(" ");
					}

					for(int j=n-1;j>=i;j--){
						
						if(i==j)System.out.print(" *");
						else System.out.print("  ");
					}


				System.out.println();
			}		
	}
}