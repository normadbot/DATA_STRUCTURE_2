import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Dialog1 {
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
							int resp=JOptionPane.showConfirmDialog(null,"Do you understand the question or not","CONFIRM",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							if(resp==JOptionPane.NO_OPTION){System.out.println("go to hell");}
							if(resp==JOptionPane.YES_OPTION){System.out.println("Cool");}
					}
			});
			panel.add(button1);
			add(panel,BorderLayout.CENTER);
		
	}
}

