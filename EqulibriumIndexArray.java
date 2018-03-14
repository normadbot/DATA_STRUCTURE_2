import java.lang.*;
import java.util.*;
public class EqulibriumIndexArray{
		public static void main(String [] args){
			 int arr[] = {-7, 1, 5, 2, -4, 3, 0};
			 int sum=0,left=0;
			 for(int i=0;i<arr.length;i++){
				 sum=sum+arr[i];
			 }
			 
			 for(int i=0;i<arr.length;i++){
				 sum=sum-arr[i];
				 if(sum==left){
					 System.out.println(i);
				 }
				 
				 left=left+arr[i];
			 }
		}
}