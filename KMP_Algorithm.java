import java.lang.*;
import java.util.*;
public class KMP_Algorithm{
		public static void main(String [] args){
			String Text="abxabcabcaby";
			String Pat="abcaby";
			char T[]=Text.toCharArray();
			char P[]=Pat.toCharArray();
			int b[]= new int[P.length];
			prefix_Array(P,b);
			
			for(int i=0,j=0;i<T.length;){
				if(T[i]==P[j]){
					i++;
					j++;
				}else{
					if(j!=0){
						j=b[j-1];
					}else{
						i++;
					}
				}
				if(j==Pat.length()){
					System.out.println("Found at Position:"+(i-j));
				}
				
			}
		}
		static void prefix_Array(char p[],int b[]){
			for(int i=1,j=0;i<p.length;){
				while(p[i]!=p[j] && j>0){
					j=b[j-1];
				}
				if(p[i]==p[j]){
					b[i]=j+1;
					i++;
					j++;
				}else{
					b[i]=j;
					i++;
				}
			}
		}
		
}