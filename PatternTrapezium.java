import java.lang.*;
import java.util.*;
public class PatternTrapezium{
		public static void main(String [] args){
		int n=5;
		int x=1;
			for(int i=0;i<n;i++){
				for(int j=0;j<i;j++){
					System.out.print("  ");
				}
				for(int k=0;k<n-i-1;k++){
					System.out.print(" "+(x++));
				}
				System.out.println(" ");
				
				
			}
			for(int q=n-1;q>=0;q--){
				for(int k=q;k>0;k--){
					System.out.print((x++)+" ");;
				}
				System.out.println();
			}
		}
}