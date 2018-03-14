import java.lang.*;
import java.util.*;
public class Pattern5 {
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j =n;j>i;j--){
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	}

}

                        