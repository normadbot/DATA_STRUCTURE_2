import java.lang.*;
import java.util.*;
public class PatternL2{
	public static void main(String[] args) {
		char a='A';
		int n=5;
		int x=(int)a;
		for(int i=0;i<n;i++){
			for(int k=n;k>=i;k--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print((char)x);
			}
				x++;
			System.out.println();
		}
	}
}