import java.lang.*;
import java.util.*;
public class Pattern54{
	public static void main(String[] args) {
		int n=10;

		for(int i=0;i<=(n/2);i++){
			for(int j=i;j>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n/2;i++){
			for(int j=n/2;j>i;j--){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}