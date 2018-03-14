import java.lang.*;
import java.util.*;
public class DP_WordBreakProblem{
	public static String Dict[]={"I","have","Jain","Sumit","am","this","dog","a"};
		public static void main(String []args){
			String str="IamSumit";
			
			System.out.println(wordBreak(str));
		}
		static boolean wordBreak(String str){
			System.out.println(str);
			if(str.length()==0){
				return true;
			}
			for(int i=1;i<=str.length();i++){
				String substr=str.substring(0,i);
				System.out.println("Substring: "+substr);
				boolean isfound=isFound(substr);
				
				if(isfound){
					boolean res=wordBreak(str.substring(i));
					System.out.println("Result: ");
					String resStr="";
					if(res){
						resStr=resStr+str;
						System.out.println("Resultant String: "+resStr);
						return true;
					}
				}
			}
			return false;
		}
		static boolean isFound(String str){
			for(int i=0;i<Dict.length;i++){
				if(str.equals(Dict[i]))return true;
			}
			return false;
		}
}