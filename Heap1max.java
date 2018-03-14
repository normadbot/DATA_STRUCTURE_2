import java.lang.*;
import java.util.*;
public class Heap1max{
	
	static void maxheap(int a[],int i,int n){
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
			int t=a[i];
			a[i]=a[largest];
			a[largest]=t;
			maxheap(a,largest,n);
		}
	}
	static void heapify(int a [] , int n){
		for(int i=n/2;i>=0;i--){
			maxheap(a,i,n);
		}
	}
	
	public static void main(String [] args){
		Heap1max h = new Heap1max();
		int a[]={3,5,9,6,8,20,10,12,18,9,84};
		System.out.println(Arrays.toString(a));
		h.heapify(a,a.length);
		System.out.println(Arrays.toString(a));
	}
}
