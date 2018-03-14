import java.lang.*;
import java.util.*;
public class Pattern1122{
		public static void main(String [] args){
			int n=5,N=1;;
			for(int i=0;i<n;i++){
				if(i%2!=0){
					String s="";
					for(int j=0;j<=i;j++){
							if(j==i){
								s=(N++)+s;
								break;
							}
							s="*"+(N++)+s;
						}
						System.out.print(s);
						
				}else{
					for(int j=0;j<=i;j++){
						
							if(j==i){
								System.out.print(N++);
								break;
							}
							System.out.print(N++);
							System.out.print("*");
					}
				}
				
				System.out.println();
			}
		}
}