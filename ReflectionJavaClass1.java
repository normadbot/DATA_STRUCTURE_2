import java.lang.*;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
class Test {
	private String s;
	public Test(){
		s="SarabjeetJI";
	}
	public void method1(){
		System.out.println("The String is "+s);
	}
	public void method2(int n){
		System.out.println("This is Number is "+n);
	}
	private void method3(){
		System.out.println("This is Private method-3");
	}
}
public class ReflectionJavaClass1{
		public static void main(String[] args)throws Exception {
			Test obj = new Test();
			Class cls= obj.getClass();
			System.out.println("The Name of the class is "+cls);

			Constructor cns = cls.getConstructor();
			System.out.println("The Constructor is "+cns);
			System.out.println("The public methods are ");

			Method[] methods= cls.getMethods();

			for (Method method :methods) {
				System.out.println(method.getName());
			}

			Method methodcal2= cls.getDeclaredMethod("method2",int.class);
			methodcal2.invoke(obj,19);

			Field field = cls.getDeclaredField("s");
			field.setAccessible(true);

			field.set(obj,"JAVA");

			Method methodcal3= cls.getDeclaredMethod("method1");
			methodcal3.invoke(obj);

			Method methodcal4= cls.getDeclaredMethod("method3");
			methodcal4.setAccessible(true);
			methodcal4.invoke(obj);

		}
}