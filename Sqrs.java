import java.lang.*;
import java.util.*;

 class Sqrs{
		static int sqr(int x){
			int a,s=0;
			while(x!=0){
				a=x%10;
				x=x/10;
				s=s+(a*a);
			
			}
			return s;
		}
		
	
		public static void  main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the limit For Series");
			int n = s.nextInt();
			for(int i=1;i<=n;i++){
					int j = sqr(i);
					int sqrroot=(int)Math.sqrt(j);
					if((sqrroot*sqrroot)==j){
						System.out.print(i+" ");
					}
			}
		}
}	