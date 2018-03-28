import java.lang.*;
import java.util.*;
public class MinimumPagesAllocated{
	public static void main(String [] args){
		int n=2;
		int a[]={12,34,67,90};
		int min_pages =a[0];
		int max_pages=0;
		for(int i=0;i<a.length;i++){
			max_pages+=a[i];
		}

		int start,end;
		start=min_pages;
		end=max_pages;
		int mid;
		int final_ans=start;
		while(start<=end){
			mid=(start+end)/2;
			if(isPossible(a,mid,n)){
					final_ans=mid;
					end=mid-1;
			}else{
				start=mid+1;
			}
			
		}
		System.out.println(final_ans);
		
	}
	
	static boolean isPossible(int a[],int max_pages,int n_students){
		int k=1;
		int current_pages=0;
		for(int i=0;i<a.length;i++){
			if(current_pages+a[i]>max_pages){
				current_pages=a[i];
				k++;
				if(k>n_students)return false;
			}else{
				current_pages+=a[i];
			}
		}
		return true;
	}
}