import java.lang.*;


public class Eco  {
	
  public static void main (String [] args )  {
  Eco e1 = new Eco();
  Eco e2 =new Eco();
  Eco e3 = new Eco();
  e3.e = e2;
  e1.e = e3;
   e2.e=e1;
  e2=null;
  e3=null;
 
  e1=null;
  
  
  
  
  }
Eco e;

}