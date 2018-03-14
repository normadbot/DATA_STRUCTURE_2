import java.lang.*;
import java.util.*;
public class DP_BridgeBuilding{
		public static void main(String [] args){
			int city_a[]={8,1,4,3,5,2,6,7};
			int city_b[]={1,2,3,4,5,6,7,8};
			sortBcitywithA(city_a,city_b);
			int No_of_Bridges=LISof_A_city(city_a);
			System.out.println(No_of_Bridges);
		}
		static int LISof_A_city(int a[]){
			int b[]=new int[a.length];
			Arrays.fill(b,1);
			for(int i=0;i<a.length;i++){
				for(int j=0;j<i;j++){
					if(a[i]>a[j]){
						if(b[i]<b[j]+1){
							b[i]=b[j]+1;
						}
					}
				}
			}
			int max=b[0];
			for(int i=0;i<b.length;i++){
				if(b[i]>max)max=b[i];
			}
			return max;
		}
		static void sortBcitywithA(int a[],int b[]){
			for(int i=0;i<b.length;i++){
				for(int j=0;j<b.length-1;j++){
					if(b[j]>b[j+1]){
						int tb=b[j];
						b[j]=b[j+1];
						b[j+1]=tb;
						
						int ta=a[j];
						a[j]=a[j+1];
						a[j+1]=ta;
					}
				}
			}
			
		}
}