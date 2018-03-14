import java.lang.*;
import java.util.*;
public class Xor2{
		public static void main(String [] args){
				int a [] = {1,2,2,3,4,5,5};
				for(int i=0;i<a.length;i++){
					int res=0;
					res=res^a[i];
					System.out.print(" "+res);
				}
				System.out.println();
				System.out.println(2<<2);
				System.out.println();
				System.out.println(8>>2);
				
		}
}