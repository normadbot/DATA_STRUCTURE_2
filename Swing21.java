///import java.lang.*;
import java.util.*;
import javax.swing.*;
public class Swing21{
	
	
		public static void main(String [] args ){
			JFrame jf= new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("this is Sexy Button");	
		JButton jb = new JButton("Call Me Sexy");
		jb.setBounds(50,100,95,30);
		jf.add(jb);
			jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);		
		}
}