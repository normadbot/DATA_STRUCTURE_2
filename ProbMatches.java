import java.lang.*;
import java.util.*;
public class ProbMatches{
		static String check(String in,String Dic){
				String s="";int inl=in.length(),dicl=Dic.length();int i1=0;
				for(int i=0;i<inl;i++){	
				l2:	for(int j=i1;j<dicl;j++){
						if(in.charAt(i)==Dic.charAt(j)){						///abbpple
							s+=Dic.charAt(j);i1=i;
							break l2;
						}
					}
				}
				
				return s;
				
		}
		public static void main(String [] args){
			Scanner s =new Scanner(System.in);
			System.out.print("The dictionary is :");
			String Dictionary[]={"ale","apple","monkey","plea","pintu","geeksfor","geeksgeek","forgeeks"};
			String str=s.next();
			String a[]=new String[Dictionary.length];
			for(int x=0;x<Dictionary.length;x++){
				a[x]=check(str,Dictionary[x]);
				
			}
			System.out.println(Arrays.toString(a));
		}
}