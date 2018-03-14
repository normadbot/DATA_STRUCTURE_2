import java.lang.*;
import java.util.*;
public class FaultyKeyBoard{
	public static void main(String [] args ){
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		for(int j=0;j<num;j++){
			int m=s.nextInt();
		int c=0;
		int l=0;
		int i=1;
		while(i<=m){
			l+=Integer.toString(i).length();
			if(m<l){
				break;
			}
			System.out.print(" "+i);
			i++;
		}
		
	  }
	}
}