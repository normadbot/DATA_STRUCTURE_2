import java.lang.*;
import java.util.*;
import java.io.*;
public class PatternL1{
	public static void main(String[] args) {
		int n=7;
		int x=1;
		for(int i=0;i<n;i++){
			for(int j=1;j<=x;j++){
				System.out.print(j+" ");
			}
			for(int k=x-1;k>0;k--){
				System.out.print(k+" ");
			}

			x++;	
			System.out.println();	
		}

	}
}