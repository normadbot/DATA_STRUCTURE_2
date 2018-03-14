import java.lang.*;

class exc extends Exception{
	public exc(String s){
		super(s);
	}
}


public class Lol {
	
	public static void valid (int i ) throws exc
	{
		if(i<18){
		throw new exc   ("You are a just a kid ");
		}
		else 
			System.out.println("Enjoy the voting ");
		
	}
 public static void main(String [] args ) {
		try {
			valid(15);
		}catch(exc e){
			System.out.println(e);
		}
		System.out.println("This is voting time");
		
	
 
 }


}