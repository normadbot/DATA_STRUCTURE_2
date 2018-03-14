import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class GUI1 {
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private JFrame frame;
	
	public static void main(String [] args ){
			GUI1  gui = new GUI1();
			gui.go();
		
	}
	
	public void go(){
		frame = new JFrame("Quiz Card  Builder");
		JPanel mainpanel = new JPanel();
		Font bigfont= new Font("sanserif",Font.BOLD,24);
		question = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setWrapStyleWord(true);
		question.setFont(bigfont);
		
		JScrollPane qScroller = new JScrollPane(question);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigfont);
		
		JScrollPane aScroller = new JScrollPane(answer);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JButton nextbutton = new JButton("Next Card");
		
		cardList = new ArrayList<Quizcard>();
		JLabel qLabel=new JLable("Question:");
		JLabel aLabel = new  JLabel("Answer");
		
		mainPanel.add(qLabel);
		mainPanel.add(qScroller);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		mainPanel.add(nextbutton);
		nextbutton.addActionListener(new NextCardListener());
		JMenuBar menuBar= new JMenuBar();
		JMenu filemenu = new JMenu("File");
		JMenuItem newmenuitem = new JMenuItem("New");
		
		JMenuItem saveMenuItem = new JMenuItem("Save");
		newmenuitem.addActionListener(new NewMenuListener());
		
		saveMenultem.addActionListener(new SaveMenuListener());
		fileMenu.add(newMenultem);
		fileMenu.add(saveMenultem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		frame.getContentPane() .add (BorderLayout. CENTER,mainPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
	}
	
	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
		QuizCard card = new QuizCard(question.getText(), answer.getText());
		cardList.add(card) ;
		clearCard ( ) ;
		}
	}
		public class SaveMenuListener implements ActionListener {
			public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getText(),answer .getText());
			cardList .add(card);
			
			JFileChooser fileSave = new JFileChooser();
			saveFile(fileSave.getSelectedFile());
		}
		
	}
	
	public class NewManuListener implements ActiOnListener{
	public void actionPerformed(ActionEvent ev) {
	cardList.clear();
		clearCard() ;
		}
	}
	
	private void clearCard() {
	question.setText("");
	answer.setText("");
	question.requestFocuS();
	}
	private void saveFile(File file){
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			
				for(QuizCard card:cardList){
					writer.write(card.getQuestion()+"/");
					writer.write(card.getAnswer()+"/");
					
				}
				writer.close();
				
			
		} catch(IOException ex){
			System.out.println("Could nt print the card list");
			ex.printStackTrace();
		}
	
	}
		
		
													

}	
	
