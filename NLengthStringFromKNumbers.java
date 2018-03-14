import java.lang.*;
import java.util.*;
public class NLengthStringFromKNumbers {
	public void print(int n, int k, int[] A) {
		if (n <= 0) {
			System.out.println(Arrays.toString(A));
		} else {
			for (int i = 1; i <= k; i++) {
				A[n - 1]=i;
				print(n-1,k,A);
			}
		}
	}
	public static void main(String[] args) {
		int n = 2;
		int k = 3;
		NLengthStringFromKNumbers i = new NLengthStringFromKNumbers();
		i.print(n, k, new int[n]);

	}

}