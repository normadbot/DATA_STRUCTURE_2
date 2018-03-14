import java.lang.*;
import java.util.*;
public class SortLargeNumbers{
		static boolean  getone(String a,String b ){
			 int alen=a.length(),blen=b.length();
			 if(alen>blen) return true;
			 if(alen<blen) return false;
			 
			if(alen==blen){
				for(int i=0;i<alen;i++){
					
				if(Character.getNumericValue(a.charAt(i))>Character.getNumericValue(b.charAt(i)))return true;
				if(Character.getNumericValue(a.charAt(i))<Character.getNumericValue(b.charAt(i))) return false; 
				
				}
			}			
			return false;
		}
	
		public static void main(String [] args ){
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the Size of Array");
			int n=s.nextInt();
			String a[]= new String[n];
			System.out.println("Enter the "+n+" Elements for Sorting ");
			for(int i=0;i<n;i++){
				a[i]=s.next();
			}
			
			
			for(int i=0;i<n;i++){
				for(int j=0;j<n-1;j++){
					if(getone(a[j],a[j+1])){
						String t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
				}
				
			}
			 System.out.println(Arrays.toString(a));
		}
}