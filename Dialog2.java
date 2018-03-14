import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Dialog2 {
	public static void main (String [] rags ) {
		EventQueue.invokeLater(new Runnable()
		{
				public void run() {
					Dialog1Frame frame = new Dialog1Frame();
					frame.setVisible(true);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				}
		});
		
	}		
	
}

class Dialog1Frame extends JFrame {
	public Dialog1Frame (){
			setTitle("Dialog1 test");
			setSize(600,600);
			JPanel panel = new JPanel();
			
			JButton button1 = new JButton("Message Button");
			button1.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent event){
							JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.WARNING_MESSAGE);
							JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.INFORMATION_MESSAGE);
							JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.ERROR_MESSAGE);
							
					}
			});
			panel.add(button1);
			add(panel,BorderLayout.CENTER);
		
	}
}

