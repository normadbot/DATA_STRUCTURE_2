import java.lang.*;
import java.util.*;
public class PatternL40{
	public static void main(String[] args) {
		int n=5;
		char a='A';
		for(int i=1;i<=n;i++){
			int x=(int)a;
			for(int l=n-1;l>=i;l--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print((char)x);
				x++;
			}
			System.out.println();
		}
	}
}