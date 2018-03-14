import java.lang.*;
import java.util.*;
public class TopperOfClass{
		public static void main(String [] args){
			int marks[]={2,2,1,3,1};
			int nstudents=marks.length;
			int k=2;
			int m[]=new int[marks.length];
			for(int i=0;i<marks.length;i++){
				m[i]=marks[i];
			}
			for(int i=0;i<marks.length;i++){
				for(int j=0;j<marks.length-i-1;j++){
					if(m[j]<m[j+1]){
						int t=m[j];
						m[j]=m[j+1];
						m[j+1]=t;
					}
				}
			}
			System.out.println(Arrays.toString(m));
			int n=0;
			int ei=0;
			while(n!=k){
				int e=m[ei];
				
				if(m[ei]==m[ei+1]){
					ei++;
					
				}else{
					for(int x=0;x<marks.length;x++){
						if(e==marks[x]){
							System.out.print(x+" ");
						}
					}
					ei++;
					n++;
				}
			}
		}	
}
