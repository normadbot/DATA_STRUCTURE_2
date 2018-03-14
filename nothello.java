import javax.swing.*;
import java.awt.*;

public class Nothello {
	public static void main(String [] args ) {
			EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					Nothelloframe frame = new Nothelloframe();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				}
			});
	}
}

class Nothelloframe extends JFrame {
	public Nothelloframe(){
			setTitle("Not helo World");
			setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
			
			Nothellocomponent component= new Nothellocomponent();
			add(component);
		
		
	}
public static final int DEFAULT_WIDTH=300;
public static final int DEFAULT_HEIGHT=200;

} 
class Nothellocomponent extends JComponent {
	
		public void paintComponent(Graphics g){
			Graphics2D g2= (Graphics2D)g;
			g.drawString("Not a hello world Program",MESSAGE_X,MESSAGE_Y);
			Rectangle2D rect = new Rectangle2D.Double(100,100,150,200);
			g2.draw(rect);
			Ellipse2D ellipse = new Ellipse2D.Double();
			ellipse.setFrame(rect);
			g2.draw(ellipse);

		}
	
	public static final int MESSAGE_X=75;
	public static final int MESSAGE_Y=100;
}