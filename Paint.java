import javax.swing.*;
import java.awt.*;
public class Paint {
	public void paintComponent(Graphics g){
		g.fillRect(0,0,this,getWidth(),this.getHeight());
		int red = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		
		Color randomColor = new Color(red,green,blue);
		g.setColor(randomColor);
		g.fillOval(70,70,100,100);
	
	}
	public static void main(String [] args ){
			Paint a = new paint();
			a.paintComponent();
	
}
}