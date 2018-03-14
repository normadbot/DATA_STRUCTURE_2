import java.lang.*;
import java.util.*;
public class XchgString{
		public static void main(String [] args ){
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the String ");
			String str1=s.next();
			System.out.println("Enter the String From you want to REPLACE FOR");
			String str2=s.next();
			System.out.println("Enter the String From you want to REPLACE WITH(SHOULD BE LESS THAN REPLACE FOR STRING)");
			String str3=s.next();
			String sum="";
			int a;
			int	x;
			String tstr="";
		o:	for(int i=0;i<=str1.length();i++){
				 a=0;
				if(str1.charAt(i)!=str2.charAt(a)){
					sum+=str1.charAt(i);
					continue;
				}
				if(str1.charAt(i)==str2.charAt(a)){
				    
					
					while(str1.charAt(i)==str2.charAt(a)){
					
						tstr+=str1.charAt(i);
					i++;a++;
						if(str2.length()>a){
							
							continue;
						}else
						{	break;}
						
					}
					System.out.println("tstr:"+tstr);
					if(tstr.equals(str2)){
						sum+=str3+str1.charAt(i);
						tstr="";
						
					}else{
						
						continue o;	
					}
				}
			}
			System.out.println("String is : "+sum);	
				
		}
}