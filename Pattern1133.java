import java.lang.*;
import java.util.*;
public class Pattern1133{
		public static void main(String []args){
			int n=3;
			int x=1,y=2;
			for(int i=0;i<n;i++){
				if(i%2==0){
					for(int j=0;j<n;j++){
						System.out.print(x+" ");
					}
					System.out.print(y);
				}else{
					System.out.print(y);
					for(int j=0;j<n;j++){
						System.out.print(x+" ");
					}
				}
				System.out.println();
				y++;
				x++;
			}
		}
}