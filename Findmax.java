import java.lang.*;
import java.util.*;
public class Findmax {
	public static  void main(String [] args ){
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Number of elements you want to enter");
		int n = s.nextInt();
		System.out.println("Enter the values ");
		int a []=new int[n]; 
		
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		int max =a[0],t=0,index=0;
		for(int j=1;j<n;j++){
			if(a[j]>max){
				max=a[j];
				index=j+1;
				t=1;
			}
			
		}
		if(t==1){
			System.out.println("Value is"+max);
			System.out.println("Index is "+index);
		}
		
	
	}

}