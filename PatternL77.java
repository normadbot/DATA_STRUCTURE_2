import java.lang.*;
import java.util.*;
public class PatternL77{
	public static void main(String[] args) {
		int n=9;

		for(int i=1;i<=n;i++){
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=i+1;j<=n;j++){
				System.out.print(j+" ");
			}
			System.out.println();

		}



	}
}