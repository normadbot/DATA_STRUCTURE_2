import java.lang.*;
import java.util.*;
public class PatternL8182{
	public static void main(String[] args) {
			int n=10;

			for(int i=1;i<=n;i++){
				for(int j=n;j>=i;j--){
					if(j==i){
						System.out.print("*");
					}else
						System.out.print(" ");
				}
				for(int j=2;j<=i;j++){
					System.out.print(" ");
				}

				for(int j=1;j<=i;j++){
					if(j==i-1){
						System.out.print("*");
					}
						System.out.print(" ");
					
				}

				System.out.println();
			}
			for(int i=2;i<=n;i++){
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