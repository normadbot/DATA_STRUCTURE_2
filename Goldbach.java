import java.lang.*;
import java.util.*;
public class Goldbach{
	static boolean primecheck(int val){
		int f=0;
		for(int i=2;i<val;i++){
			if(val%i!=0){
				continue;
			}
				f++;
		}
		if(f==0){return true;}
		else{return false;}
	}
	public static void main(String [] args ){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Even Number greater Than 2");
		int n=s.nextInt();
		if(n<=2){
			System.out.println("enter the Number Greate than 2 ");
			System.exit(0);
		}
		if(n%2!=0){
			System.out.println("enter the Even number ");
			System.exit(0);
		}
		for(int i=3;i<n;i++){
			if(primecheck(n-i)==true){
				if(primecheck(i)==true){
					System.out.println(i+"+"+(n-i));
					break;
				}
			}
		}
		
	
	}
}