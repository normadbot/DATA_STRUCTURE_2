import java.lang.*;
import java.util.*;
public class ConsecutiveRepeating{
		static int findmax(int []a){
			int max=a[0],pos=0;
			for(int i=0;i<a.length;i++){
				if(max<a[i]){
					max=a[i];
					pos=i;
				}
			}
			return pos;
		}
		public static void main(String [] args){
			Scanner s =new Scanner(System.in);
			System.out.println("enter the String ");
			String str= s.next();
			int c=0,x=0;
			int a[]=new int[str.length()];
			char ch[]= new char[str.length()];
			for(int i=0;i<str.length();i++){
				c=0;
				int j;
				for( j=i+1;j<str.length();j++){
					if(str.charAt(i)==str.charAt(j)){
						c++;
					}
					else{
						
						break;
					}
				}
				ch[x]=str.charAt(i);
				a[x]=c;
				x++;
				i=j-1;
			}
			int pos=findmax(a);
			System.out.println(ch[pos]);
			System.out.println(Arrays.toString(ch));
		}
}