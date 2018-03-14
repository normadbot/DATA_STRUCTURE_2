import java.lang.*;
import java.util.*;
public class DuplicatArray1{
		public static void main(String [] args){
				int a[] = {1,2,3,1,3,6,6};
				int b[]=new int[6];
				for(int i=0;i<6;i++){
					int t=0,c=0;
					for(int j=i+1;j<=6;j++){
						 if(a[i]==a[j]){
							t=1; 
							c=c+1;
						 }

					}			

						if(t>0){
							for(int k=0;k<6;k++){
								if(b[i]!=a[i]){
									b[i]=a[i];
								}
								
							}
						System.out.println("Repeat"+c+"is "+a[i]);	
						}
				}
		
		for(int y =0;y<6;y++){
			System.out.println(b[y]);
			
		}
		
		}
}