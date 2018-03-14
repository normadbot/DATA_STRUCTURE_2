import java.lang.*;
public class Exc {
 public static void main(String [] args ) {
	try{	dostuff();}
	catch(Exception e){
	System.err.println("Error");
	}
	finally{
		System.err.println("Error has occured in it while division process");
	}
 }
 static void dostuff(){
	 domorestuff();
 }
static void domorestuff(){
	int x=5/0;
	System.out.println(x);
}
 


}