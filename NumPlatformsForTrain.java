import java.lang.*;
import java.util.*;
public class NumPlatformsForTrain{
		public static void main(String [] args){  //Maximum Platforms required at a time//
			int ar[]={900,940,950,1100,1500,1800};
			int dr[]={910,1200,1120,1130,1900,2000};
			int a[]=new int[ar.length];
			int c=0;
			int t=0;	
			for(int i=0;i<ar.length;i++){
				if(a[0]==0){
					a[t]=dr[t];
					t++;
					c++;
					continue;
				}
				int w=0,q=0;
				for(int j=0;j<a.length;j++){
					 
					if(a[j]>ar[i] && a[j]!=0){
			
						w=1;
					}else if(a[j]<ar[i] && a[j]!=0){
						a[j]=dr[i];
						w=0;
						break;
					}
				}
				if(w==1){
				//	System.out.println("here");
					a[t]=dr[t];
					t++;
					c++;
				}
			//	Arrays.sort(a);
			}
		//	System.out.println(Arrays.toString(a));
			System.out.println(c);
		}
}