import java.lang.*;
import java.util.*;
class MergeSort11  {
	
static int a[] ={38,27,43,3,9,82,10};
	void mergeSort(int a[],int beg,int end){
		int mid;
		if(beg<end){
		 mid =(beg+end)/2;
		mergeSort(a,beg,mid);
		mergeSort(a,mid+1,end);
		merge(a,beg,mid,end);
		}
	}
	void merge(int a[],int beg,int mid,int end){
		int i=beg;
		int j=mid+1;
		int tem[]=new int[a.length];
		int index=beg;
		while(i<=mid && j<=end){
			if(a[i]<a[j]){
				tem[index]=a[i];
				i=i+1;
			}else{
				tem[index]=a[j];
				j=j+1;
			}
			index=index+1;
		}
		if(i>mid){
				while(j<=end){
					tem[index]=a[j];
					j=j+1;
					index++;
				}
		}else{
				while(i<=mid){
					tem[index]=a[i];
					i=i+1;
					index=index+1;
				}
		}
		int k=beg;
		while(k<index){
			a[k]=tem[k];
			k=k+1;
		}
	}
	public static void main(String [] args){
		MergeSort11 ms = new MergeSort11();
		
		int n=a.length;
		ms.mergeSort(a,0,n-1);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}
}