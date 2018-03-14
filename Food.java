import java.lang.*;
 class Popcorn {
	public void pop(){
	System.out.println("popcorn");
 }}
	public	class Food{
		public static void main(String [] args ){
					
			Popcorn p = new Popcorn() {
				public void pop(){
				 System.out.println("Anonymous Popcorn");
				}
			};
			p.pop();
		

	}
		}
