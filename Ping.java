import java.lang.*;

class Utils {

int getInt(String x) throws Exception {return 7;} 

}
public class Ping extends Utils {
  
  
  int getInt(String arg)
  {
	return Integer.parseInt(arg);
   }	
   
   
   public static void main (String [] args) throws Exception
   {  try{
	   Utils u= new Ping();
	 System.out.println(u.getInt(args[0]));
	 }
	 catch(Exception e) { 
	 e.printStackTrace();
	 throw e;
	 }
	 
	 }
	
}	