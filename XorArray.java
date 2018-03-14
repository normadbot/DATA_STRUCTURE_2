import java.lang.*;
import java.util.*;
public class XorArray{
		public static void main(String [] args ){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the Size of Array ");
				int n=s.nextInt();
				System.out.println("Enter the Elements of Array ");
				int a[]= new int[n];
				for(int x=0;x<n;x++){
					a[x]=s.nextInt();
				}
				System.out.println("Normal Array : "+Arrays.toString(a));
				int XOR=0;
				for(int i=0;i<n;i++){
					XOR^=a[i];
				}
				for(int j=0;j<n;j++){
					a[j]=XOR^a[j];
				}
				System.out.println("Xor Array : "+Arrays.toString(a));
		}
}