import java.awt.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {
	@Override
	void paintComponent(Graphics g){
		g.setColor(Color.orange);
		g.fillRect(20,50,100,100);}
	public static void main(String [] args ){
		
		MyDrawPanel a = new MyDrawPanel();
		a.paintComponent();
	}

}