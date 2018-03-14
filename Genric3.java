import java.util.*;
import java.lang.*;
public class Genric3 {
	public static void main(String [] args ) {
		Student s1 = new Student(001,"Saby","CSE");
		Student s2 = new Student(002,"KAne","IT");
		Student s2 = new Student (003,"Ross","ECE");
		
		List<Student> stu= new ArrayList<Student>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		
		 Iterator itr=al.iterator();  
  
	while(itr.hasNext()){  
    Student st=(Student)itr.next();  
    System.out.println(st.rollno+" "+st.name+" "+st.age);  
  }  
	}
}