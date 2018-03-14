import java.lang.*;
import java.util.*;
public class NormalTrace {
		
		
		public static void main(String [] args ){
				Scanner s = new Scanner(System.in);
				System.out.println("Enter The  values of 3x3 Matrix: ");
				int a[][]=new int[3][3];
				for(int x=0;x<3;x++){
					for(int y=0;y<3;y++){
						a[x][y]=s.nextInt();	
					}
				}
				for(int b=0;b<3;b++){
					for(int c=0;c<3;c++){
						System.out.print(a[b][c]+" ");
					}
					System.out.println();
				}
				int normal=0;
				double trace=0;
				for(int i=0;i<3;i++){
					for(int j=0;j<3;j++){
						
							normal+=Math.pow(a[i][j],2);
						
						if(i==j){
							trace+=a[i][j];
						}
					}					
				}
				System.out.println("Normal of this Matrix is: "+Math.sqrt(normal));
				System.out.println("Trace of this Matrix is :"+trace);
		
		}

}