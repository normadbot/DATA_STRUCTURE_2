import java.lang.*;
import java.util.*;
public class MyInsertionSort {
    public static void main(String a[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();	
	   int[] arr1 = new int[n];
	   System.out.println("Enter Elements");
	   for(int i=0;i<n;i++){
		   arr1[i]=s.nextInt();
	   }
        int[] arr2 = doInsertionSort(arr1);
        for(int x=0;x<n;x++){
            System.out.print(arr2[x]);
            System.out.print(", ");
        }
    }
    public static int[] doInsertionSort(int[] input){    
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}
