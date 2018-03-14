import java.lang.*;
import java.util.*;
public class LongestOneSequence{
		public static void main(String []args ){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter the Number");
				int a[]= new int[20];
				int n=s.nextInt();
				int c=0;
				while(n>0){
					int bit=n%2;
					a[c]=bit;
					c++;
					n=n/2;
				}
				for(int j =12;j>=0;j--){
				System.out.print(a[j]+" ");
			}
			System.out.println();
			int b[]=new int [20];
			int pos=0,c1=0;
			for(int i=19;i>=0;i--){
				if(a[i]==0){
					pos=i;
					b[c1]=pos;
				    c1++;
				}
			}
			for(int i=0;i<12;i++){
				System.out.print(b[i]+" ");
			}
			System.out.println();
			int  max=b[0]-b[1];
			for(int i=2;i<19;i+=2){
				if(max<(b[i-1]-b[i+1]) ){
					max=b[i-1]-b[i+1];
				}
			}
			System.out.println("  "+(max+1));
		}
}