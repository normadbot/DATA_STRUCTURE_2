import java.lang.*;

 class Outer5 {
		static int x =15;
		static	class Inner5 {
				 void show() {
					System.out.println("this is show method in Inner5 class "+x);	}	
		         	}
				
		
						public static void main(String [] args ){
							Outer5.Inner5 o = new Outer5().new Inner5();	
								o.show();
						       }

} 