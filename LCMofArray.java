import java.lang.*;
import java.util.*;
public class LCMofArray{
	static int GCD(int a,int b){
		if(b==0)return a;
		return GCD(b,a%b);
	}
	public static void main(String []args){
		int a[]={1,2,11,5,7};
		int ans=a[0];
		for(int i=1;i<a.length;i++){
			ans=(ans*a[i])/GCD(ans,a[i]);
		}
		System.out.println(ans);
	}
}
