import java.lang.*;
import java.util.*;
public class StringVowelReplace{
	static	boolean check(char ch){
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				return true;
			}			
			return false;
		}
	static	int pos(char ch){
			char ar[]={'a','e','i','o','u'};
			for(int i=0;i<ar.length;i++){
				if(ch==ar[i]){
					return i;
				}
			}
			return 0;
		}
		public static void main(String [] args){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter String");
			String str = s.nextLine();
			char ar[]={'a','e','i','o','u'};
			char br[]={'u','o','i','e','a'};
			char st[]=str.toCharArray();
			int p=0,q=0;
			for(int i=0;i<str.length();i++){
				q=0;
				p=0;
				if(check(st[i])){
					 p=pos(st[i]);
					st[i]=br[p];
				}
			}
			for(int i=0;i<st.length;i++){
				System.out.print(st[i]);
			}
		}
}

