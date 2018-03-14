import java.lang.*;

public class Outer2 {
		private int age =0;
		private String name ="sarabjeet";
		
		
		
			public class Inner2 {	
				private String name ="Saby";
				private int age = 19;
				public void change() {
					
					
					System.out.println("The age :"+Outer2.this.age);
					System.out.println("The age :"+Inner2.this.age);
					System.out.println("The age :"+Outer2.this.name);
					System.out.println("The age :"+Inner2.this.name);
				}
				
				
		}
						public static void main(String [] args) {
							Outer2.Inner2 i = new Outer2().new Inner2();
							i.change();
						
				
						}
}