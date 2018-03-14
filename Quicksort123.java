import java.lang.*;
import java.util.*;
public class Quicksort123{
		void swap(int []a,int index1,int index2){
			int temp=a[index1];
			a[index1]=a[index2];
			a[index2]=temp;
		}
		void quicksort(int a[],int beg,int end){
			int i=beg;
			int j=end;
			int pivot = (beg+end)/2;
			while(i<j){
				while(a[i]<a[pivot])i++;
				while(a[j]>a[pivot])j--;
				if(i<=j){
					swap(a,i,j);
					i++;
					j--;
				}
			}
			
			if(beg<j)quicksort(a,beg,j);
			if(end>i)quicksort(a,i,end);
		}
		public static void main(String [] args){
			int a[]={14,52,9,21,7,65,77};
			int n=a.length;
			Quicksort123 qs = new Quicksort123();
			qs.quicksort(a,0,n-1);
			for(int i=0;i<n;i++){
				System.out.print(" "+a[i]);
			}
		}
}