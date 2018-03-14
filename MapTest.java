import java.util.*;

class Dog {
	public Dog(String n){name = n;}
	public String name ;
	public boolean equals(Object o){
	if((o instatnceOf Dog) && (((Dog) o).name == name )){
	return true;}
	else {
	return false;
	}
	}
	public int hashCode () {return name.length();}
}
class Cat {}
	enum Pets {DOG,CAT,HORSE}
class Maptest {
		public static void main(String []  args ) {
			Map<Object ,Object> m = new HashMap<Object ,Object >();
			m.put("k1",new Dog("aiko"));
			m.put("k2", Pets.DOG);
			m.put(Pets.CAT,"CAT key");
			Dog d1 = new Dog("Clover");
			m.put(d1,"Dog Key");
			m.put(new Cat(),"cat key");
			
			System.out.println(m.get("k1"));
			String K2 = "k2";
			System.out.println(m.get(k2));
			Pets p = Pets.CAT;
			System.out.println(m.get(p));
			
			
			
		}

}	
	

	
	
																	