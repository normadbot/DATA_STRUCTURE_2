import java.lang.*;


public class Truck extends Loading  {
public Truck() {
System.out.println("This is truck class");
}



public static void main(String [] args){
	Loading d = new  Loading();
	Vehicle e = new Vehicle();
	Truck f = new Truck();
	
	d.Loading();
	e.Vehicle();
    f.Truck();
}

}