import java.lang.*;
import java.util.*;

public class SqrtDigit{
	
	
	
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int k = sc.nextInt();
		 long i,c,j,l,s,sum=0;
        for(i=1;i<=k;i++)
        {
            s=0;
            
            for(j=i;j>0;j/=10)
             s=s+(j%10)*(j%10);   
            
                 c=0;
                for(l=1;l<=s;l++)
                {
                    if((l*l)==s)
                    {
                        c=1;
                        break;
                    }
                }
                if(c==1)
                sum+=i;
        }           
        System.out.println(sum);


	}	

}