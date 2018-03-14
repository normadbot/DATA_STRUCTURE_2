import java.lang.*;
import java.util.*;
 class Outer11{
		   String str="";
		Outer11(String st){
			this.str=st;
		}
		void disp(){
		Inner11 i = new Inner11();
		i.show();
		}
			class Inner11{
			void show(){
					System.out.println(str);
				}
			}
		
}
public class OUTEREXE{
		public static void main(String [] args ){
			String stri="SABY"	;	
			Outer11 o = new Outer11(stri);
			o.disp();			
		}
}