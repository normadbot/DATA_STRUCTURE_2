import java.lang.*;
import java.util.*;
public class DP_BinomialCoefficients{
	public static void main(String [] args){
		int n=2;
		int k=1;
		System.out.println(binomialCoefficients1(n,k));
		System.out.println(binomialCoefficients2(n,k));
	}
	static int binomialCoefficients1(int n,int k){
		if(k==0||n==k)return 1;
		return binomialCoefficients1(n-1,k-1)+binomialCoefficients1(n-1,k);
	}
	static int binomialCoefficients2(int n,int k){
		int res=fact(n)/(fact(k)*fact(n-k));
		return res;
	}
	static int fact(int n){
		int f=1;
		for(int i=1;i<=n;i++){
			f=f*i;
		}
		return f;
	}
}