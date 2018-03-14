import java.lang.*;
import java.util.*;
public class MergeSort1{
		static void msort(int []a,int i ,int j){
			if(i<j){
				int mid=(i+j)/2;
				msort(a,i,mid);
				msort(a,mid+1,j);
				merge(a,i,mid,j);
				
			}
		}
		
		static void merge(int a[],int beg,int mid,int end){
			int i=beg,j=mid+1,index=0;
			int Temp[]= new int[a.length];
			while(i<=mid && j<=end){
				if(a[i]<a[j]){
					 Temp[index]=a[i];
					i++;
				}
				else {
					Temp[index]=a[j];
					j++;
				}
				index++;
			}
			if(i>mid){
				while(j<=end){
					Temp[index]=a[j];
					index++;i++;
				}
			}
			else{
				while(i<=mid){
					Temp[index]=a[i];
					index++;i++;
				}
			}
				int k=0;
				while(k<index){
					a[k]=Temp[k];
					k++;
				}
		}
	
		public  static void main(String [] args ) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the Size Of Array");
			int n=s.nextInt();
			System.out.println("Enter the Elements of an array");
			int a[]= new int[n];
			for(int j=0;j<n;j++){
				a[j]=s.nextInt();
			}	
			msort(a,0,n-1);
			for(int k=0;k<n;k++){
				System.out.print(a[k]+" ");
			}
		
		
		}
}	