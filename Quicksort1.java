import java.lang.*;
import java.util.*;
public class Quicksort1 {
		
		
		public static void quickSort(int array[], int start, int end)
{
        int i = start;                          
        int k = end;                            

        if (end - start >= 1)                   
        {
                int pivot = array[start];       

                while (k > i)                   
                {
                        while (array[i] <= pivot && i <= end && k > i)  
                                i++;                                    
                        while (array[k] > pivot && k >= start && k >= i) 
                            k--;                                        
                        if (k > i)                                      
                                swap(array, i, k);                      
                }
                swap(array, start, k);          
                                                
                quickSort(array, start, k - 1); 
                quickSort(array, k + 1, end);   
        }
        else
        {
                return;
        }
}

public static void swap(int array[], int index1, int index2) 

{
	int temp = array[index1];           
	array[index1] = array[index2];      
	array[index2] = temp;               
}
			
			
		
		public static void main(String [] args ){
			Scanner s =new Scanner(System.in);
			System.out.println("Enter the size of an array");
			int n = s.nextInt();
			System.out.println("Enter the Elelments of an array");
			int a[] = new int[n];
			for(int k=0;k<n;k++){
				a[k]=s.nextInt();
			}		
				
			quickSort(a,0,n-1);
			
			for(int j = 0;j<n;j++){
				System.out.print(a[j]+" ");
			}
			
		}
		

}
	
                                                                        																	
																		