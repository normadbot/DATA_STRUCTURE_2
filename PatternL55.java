import java.lang.*;
import java.util.*;
public class PatternL55{
	public static void main(String[] args) {
		int n=9;
		int x=1;
		for(int i=1;i<=n;i++){
			for(int l=n;l>i;l--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(x+" ");
			}
			x++;
			System.out.println();
		}
		x--;
		x--;
		for(int i=1;i<n;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j=n-1;j>=i;j--){
				System.out.print(" " +x);
			}
			x--;
			System.out.println();
		}
	}
}