import java.lang.*;
import java.util.*;
public class Partition1{
	static boolean find(int a[]){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		if(sum%2!=0){
			System.out.print("The Sum cannogt be Divided");
			return false;
		}
		return isSumOfSubset(a,a.length,sum/2);
	}
	
	static boolean isSumOfSubset(int a[],int len,int sumhalf){
		if(sumhalf==0)return true;
		if(len==0 && sumhalf!=0)return false;
		if(a[len-1]>sumhalf){
			return isSumOfSubset(a,len-1,sumhalf);
		}
		return isSumOfSubset(a,len-1,sumhalf)|| isSumOfSubset(a,len-1,sumhalf-a[len-1]);
	}
		public static void main(String [] args){
			int a[]={1,5,11,5};
			int b[]={1,5,3};
			System.out.print(find(a));
		}
}