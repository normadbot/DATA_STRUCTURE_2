import java.lang.*;



public class Inc {
 static int p=0,q=0,a,b;
 public static void main( String [] args ){
        
		a=p++;
		b=++q;
		System.out.println("a= "+ a);//0
		System.out.println("b= "+ b);//1
  
  
        System.out.println("p ="+ p);//1
        System.out.println("q ="+ q);//1
 
        System.out.println("++a ="+ ++a);//1
		System.out.println("b++ ="+  b++);//1
		
		
		System.out.println("a ="+ a);//1
		System.out.println("b =" + b);//2	
		
		System.out.println("a++ ="+ a++);//1	
		System.out.println("++b ="+ ++b);//3
 
        System.out.println("a ="+ a);//2
		System.out.println("b =" + b);//3
 
 }



}