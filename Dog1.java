import java.lang.*;
import java.util.*;
class Animal {
 static void doStuff() {
System.out.print("a ");
}
}
class Dog1 extends Animal { 
 static void doStuff() { // it's a redefinition,
// not an override
System.out.print("d ");
}
public static void main(String [] args) {
	Animal a = new Animal();
	a.doStuff();
	Animal b = new Dog1();
	b.doStuff();
	Dog1 c = new Dog1();
	c.doStuff();
	//Dog1 d = new Animal();
	//d.doStuff();
   // doStuff();
}
}