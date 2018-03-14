import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Dialog3 {
	public static void main (String [] args ) {
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
							//JDialog.setDefaultLookAndFeelDecorated(true);
							Object [] selectionvalues = {"sabby","maddy","jazz"};
							String input;
							String initialselection = "sabby";
							Object Selection = JOptionPane.showInputDialog( null,"Choose UserName from Below.","UserName",JOptionPane.QUESTION_MESSAGE,null,selectionvalues,initialselection);
							System.out.println(Selection);
							
							
					}
			});
			panel.add(button1);
			add(panel,BorderLayout.CENTER);
		
	}
}
