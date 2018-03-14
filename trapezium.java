import java.lang.*;
import java.util.*;

class trapezium{
public static void main(String [] args){
int i,j,s,x=1,k=1,l;

for(i=4;i>=1;i--){
		
		for(s=4;s>i;s--)
		System.out.print(" ");
			
			for(j=1;j<=i;j++){
			System.out.print(x++ +"*");
			}
			
			for(l=1;l<=i;l++){
			System.out.print(k+i*i);
				if(l!=i)
					System.out.print("*");
			k++;
			}
			System.out.println();
		}
	}
}