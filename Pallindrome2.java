import java.lang.*;
import java.util.*;
public class Pallindrome2{
	public static void main(String [] args )throws StringIndexOutOfBoundsException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int n = str.length();
		char [] a= new char[n];
		
		for(int u =0;u<=n;u++){
			 a[u]=str.charAt(u);
  		}
	                                                                                  //Not Worked due to StringIndexOutOfBoundsException coz of all Length Problems//	
							
		for(int i=0;i<(n/2)-1;i++){
				if(a[i]==(a[n-i-1])){
					System.out.println("Its is a Pallindrome");
				}				
				else{ 
					System.out.println("Its is not a pallindrome");
				}
		}
	}
}