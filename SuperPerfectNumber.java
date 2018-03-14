import java.lang.*;
import java.util.*;
public class SuperPerfectNumber{
		public static  void main(String [] args ){
				Scanner s =new Scanner(System.in);
				System.out.println("Enter the number For Checking");
				int num= s.nextInt();
				int sigma1=0,sigma2=0;
				for(int i=num;i>0;i--){
					if(num%i==0){
						sigma1+=i;
					}
				}
				for(int j=sigma1;j>0;j--){
					if(sigma1%j==0){
						sigma2+=j;
					}
				}
				if(sigma2==(2*num)){
					System.out.println("Yes ");
				}
				else{
				System.out.println("No");
				}
		}
}