import java.lang.*;
import java.util.*;
public class GeneratePasswords{
		public static void main(String [] args){
			GeneratePasswords a = new GeneratePasswords();
			String s="abc";
			int len=3;
			String str="";
			for(int i=0;i<len;i++){
				str=str+s.charAt(i);
				for(int j=0;j<len;j++){
					a.permutation(str,0,i);
				}
			
			}
			
			
		}
		void permutation(String a,int l,int r){
				if(l==r){
					System.out.println(a);
				}else{
					for(int i=l;i<=r;i++){
						a=swap(a,l,i);
						permutation(a,l+1,r);				
						a=swap(a,l,i);
				
					}
				}
				
		}
		String swap(String s ,int i,int j){
				char a[] =s.toCharArray();
				char temp= a[i];
				a[i]=a[j];
				a[j]=temp;
				return String.valueOf(a);
		}
}
