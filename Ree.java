import javax.swing.*;

public class Ree {
 public static void main(String [] args) { 
 
     JButton a = new JButton();
     JButton b =new JButton();
	 JButton  c = b;
     System.out.println("Is a reference b/w a and b "+ (a==b));
	 System.out.println("Is a reference b/w b and c "+ (b==c));
	 System.out.println("Is a reference b/w a and c "+ (a==c));
 System.out.println(3+7+"ABC"); 
 System.out.println("ABC"+3+7); 
 System.out.println("ABC"+(3+7)); 
 System.out.println(3+7+"a"); 
 
  }


}