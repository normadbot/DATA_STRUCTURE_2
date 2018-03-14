import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
public class ImageText {
	public static void main(String [] args ) {
		EventQueue.invokeLater( new Runnable()
		{
			public void run()
			{
				ImageFrame frame = new ImageFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	
	}


}

class ImageFrame extends JFrame {
		public ImageFrame(){
			setTitle("ImageTester");
			setSize(DEFUALT_WIDTH,DEFAULT_HEIGHT);
			ImageComponent component = new ImageComponent();
			add(component);
			}
	public static final int DEFAULT_HEIGHT=200;
	public static final int DEFUALT_WIDTH=300;
	
}
class ImageComponent extends JComponent{
	private Image image;
	public ImageComponent(){
			try{
					image=ImageIO.read(new File("C:\\Users\\SARABJEET\\Pictures\\Screenshots"));
			}catch(IOException e){
				e.printStackTrace();
			}
	}
	
	public void paintComponent(Graphics g){
		if(image==null)return;
		int imageWidth= image.getWidth(this);
		int imageHeight= image.getHeight(this);
		g.drawImage(image,0,0,null);
		
		for(int i=0;i*imageWidth<=getWidth();i++)
			for(int j =0;j*imageHeight<=getHeight();j++)
				if(i+j>0)g.copyArea(0,0,imageWidth,imageHeight,i*imageWidth,j*imageHeight);
		
	}
	
}