import java.lang.*;
import java.util.*;
public class PatternL39{
	public static void main(String[] args) {
		int n=5;

		for(int i=1;i<=n;i++){
			for(int l=n-1;l>=i;l--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print(j+"");
			}
			System.out.println();
		}
	}
}