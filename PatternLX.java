import java.lang.*;
import java.util.*;
public class PatternLX{
	public static void main(String[] args) {
		int n=5;

		for(int k=1;k<=n;k++){
			for(int i=1;i<=n;i++){
				if(i==k||i+k==n+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
}