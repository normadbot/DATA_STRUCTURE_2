import java.awt.Dimension.*;


public class Referencetest  {

 public static void main(String [] args ) {
 Dimension d=new Dimension(5,10);
 Referencetest rt = new Referencetest();
 System.out.printyln("Before Modify() d.Height ="+d.height);
 rt.modify(d);
 System.out.println("After modify () d.height "+d.height);
 
 }
 public void modify(Dimension din) {
 dim.height=dim.height+1;
 System.out.println("dim = "+dim.height);
 }


}