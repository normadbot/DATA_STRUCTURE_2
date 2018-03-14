import java.lang.*;
import java.util.*;
public class InsertInArray{
			public static void main(String [] args ){
					Scanner s = new Scanner(System.in);
					int a[]= new int[7];
					a[0]=1;
					a[1]=6;
					a[2]=3;
					a[3]=18;
					a[4]=36;
					a[5]=2;
					System.out.println(Arrays.toString(a));
					System.out.println("Enter the Element you want to Insert");
					int num= s.nextInt();
					System.out.println("Enter the Element You want to Insert AFTER");
					int afnum=s.nextInt();
					int pos=0,t=0,p=0;
					for(int i=0;i<a.length-1;i++){
						if(a[i]==afnum){pos=i+1;p=i;t++;}
						
					}
				
					if(t==0){
						System.out.println("Sorry element not Found And So exiting");
						System.exit(0);
					}
					
					for(int j=a.length-1;j>pos;j--){
						
						a[j]=a[j-1];
						
					}
					a[p+1]=num;
					for(int k=0;k<a.length;k++){
					    System.out.print(a[k]+" ");
						
					}
				
			}
}
