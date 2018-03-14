import java.lang.*;
import java.util.*;
public class Rabin_Karp{
		public static void main(String [] args){
			String Text="abcdxabcde";
			String Pat="abcde";
			int q_prime=57;
			 int T[]={4,1,3,3,1,2,4,4,5,6,1,2,3,1,2,4};//figerprints generated//
			 int P[]={1,2,4};//Fingerprints Generated//
			
			// int T[]=new int[Text.length()];
			// int P[]=new int[Pat.length()];
			
			// for(int i=0;i<T.length;i++){
				// int x=Text.charAt(i);
				// T[i]=x%10;
			// }
			// for(int i=0;i<P.length;i++){
				// int x=Pat.charAt(i);
				// P[i]=x%10;
			// }
			int pow=P.length-1;
			int s_p=0;
			for(int i=0;i<P.length;i++){
				s_p+=Math.pow(10,pow--)*P[i];
			}
		//	System.out.println(s_p);
			int computed_mod=s_p%q_prime;
			System.out.println(s_p+"Mod Prime is:"+computed_mod);
			long s_t=0;
				pow=P.length-1;
				
				for(int j=0;j<P.length;j++){
					s_t+=Math.pow(10,pow--)*T[j];
				}
			//	System.out.println(s_t);
			if(s_t%q_prime==computed_mod){
				System.out.println("Found at Position"+1);
			}
			for(int i=0;i<T.length-P.length;i++){
				s_t=10*(s_t-100*T[i])+T[i+P.length];
				if(s_t%q_prime==computed_mod){
					System.out.println("Found at Position"+(i+1));
				}
			}
		}
}