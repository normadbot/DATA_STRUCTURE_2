import java.lang.*;


 class Master {
 String doFileStuff() throws FileNotFoundException { return "a"; }
 }
   class Slave extends Master {
 public static void main(String [] args) {
 String s = null;
 try {
 
 s=new Slave().doFileStuff();
 
 }catch(Exception x) {
 s="b";
 }
 System.out.println(s);
 
 }
 String doFileStuff()throws NumberFormatException,FileNotFoundException {return "b";}
 }