import java.lang.*;
import java.util.*;
public class MinHeapToMaxHeap{
	void minHeapToMaxHeap(int a[]){
		int n=a.length;
		for(int i=n/2;i>=0;i--){
			heapify(a,i,n);
		}
	}
	void heapify(int a[],int i,int n){
		int l=2*i;
		int r=2*i+1;
		int largest=i;
		if(l<n && a[i]<a[l]){
			largest=l;
		}
		if(r<n && a[largest]<a[r]){
			largest=r;
		}
		if(largest!=i){
			swap(a,i,largest);
			heapify(a,largest,n);
		}
	}
	void swap(int a[],int i,int j){
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	public static void main(String [] args){
		MinHeapToMaxHeap b = new MinHeapToMaxHeap();
		int a[]={3,5,9,6,17,19,10,22,84};
		b.minHeapToMaxHeap(a);
		System.out.println(Arrays.toString(a));
	}
}