import java.lang.*;
import java.util.*;
public class Quicksort124{
	void swap(int []a,int index1,int index2){
			int temp=a[index1];
			a[index1]=a[index2];
			a[index2]=temp;
		}
	int partition(int a[],int beg,int end){
			int i=beg;
			int pivot =a[beg];
			for(int j=i;j<=end-1;j++){
				if(a[j]<=pivot){
					i++;
					swap(i,j);
				}
			}
			swap(i+1,end);
			return (i+1);
	}
		void quicksort(int a[],int beg,int end){
			if(beg<end){
				int p=partition(a,beg,end);
				quicksort(a,beg,p-1);
				quicksort(a,p+1,end);
			}
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