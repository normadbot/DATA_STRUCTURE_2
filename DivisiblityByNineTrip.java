import java.lang.*;
import java.util.*;
public class DivisiblityByNineTrip{
		static String reversekr(String str){
			String st="";
			for(int i=str.length()-1;i>=0;i--){
				st+=str.charAt(i);
			}
			return st;
		}
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a number :");
			String str= s.next();
			int j=0;
			//String str="1244633121";
			String st="",rev="";
			int num=0;
			for(int i=str.length()-1;i>=0;i--){
				 st="";
				j=i;
				int p=0;
				while(p<3){
					if(j==-1 && p==1 ){
					st="00"+st;
					break;
					}
					if(j==-1 && p==2 ){
					st="0"+st;
					break;
					}
					st+=str.charAt(j);
					 rev=reversekr(st);
					i=j;
					j--;
					p++;
				}
				System.out.println(rev);
				 num+=Integer.parseInt(rev);
			}
				System.out.println(num);
			
		}
}
