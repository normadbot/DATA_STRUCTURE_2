import java.lang.*;
import java.util.*;
public class Pallindrome3{
	public static void main(String [] args )throws StringIndexOutOfBoundsException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int n = str.length();
		char [] a= new char[100];
		
		for(int u =0;u<=n;u++){
			 a[u]=str.charAt(u);
  		}
	                                                                                  //Not Worked due to StringIndexOutOfBoundsException coz of all Length Problems//	
							
		for(int i =0, j=a.length;(i<=a.length/2)&&(j>a.length/2);i++,j--){
				if(a[i]==(a[j])){
					System.out.println("Its is a Pallindrome");
				}				
				else{ 
					System.out.println("Its is not a pallindrome");
				}
		}
	}
}