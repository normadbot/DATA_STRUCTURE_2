import java.lang.*;
import java.util.*;
public class SortZeroOneTwoArray{
		public static void main(String [] args){
			int arr[]={2,2,0,1};
			int low=0;
			int mid=0;
			int high=arr.length-1;
			while(mid<=high){
				if(arr[mid]==0){
					swap(arr,mid,low);
					mid++;
					low++;
		//	System.out.println(Arrays.toString(arr)+" here1");
				}else if(arr[mid]==1){
					mid++;
		//	System.out.println(Arrays.toString(arr)+" here2");
				}else if(arr[mid]==2){
					swap(arr,mid,high);
					high--;
		//	System.out.println(Arrays.toString(arr)+" here3");
				}
			}
		}
		static void swap(int arr[],int a,int b){
			int t=arr[a];
				arr[a]=arr[b];
				arr[b]=t;
		}
}