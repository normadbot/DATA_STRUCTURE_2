import java.lang.*;


public class Init {
  
  Init(int x) {System.out.println("1-arg Constructor");}
  
  Init(){System.out.println("no -arg Constructor");}
  static 
  { System.out.println("1 static init");}
  
  {System.out.println("1 instance init");}
  
  {System.out.println("2 instance init");}

  static {System.out.println("2  static init ");}
   
   public static void main (String [] args) {
    
//	new Init(7);
//	new Init();
int	j=1;
int	i=1;
	System.out.println(j--);
	System.out.println(--i);
	System.out.println(j);
	
	}
  
}
