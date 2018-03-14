import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Swing33   {
		public static void main(String [] args ){
				JFrame f = new JFrame("this is me");
				 JTextField tx = new JTextField();
				tx.setBounds(50,50,150,20);
				JButton b = new JButton("Click here");
				b.setBounds(50,100,95,30);
				b.addActionListener(new ActionListener(){
					
					
					public void actionPerformed(ActionEvent e){
						tx.setText("This is baby Boy Sabby");
					}
					
				});
				f.add(b);
				f.add(tx);
				f.setSize(400,400);
				f.setLayout(null);
				f.setVisible(true);
		}
}