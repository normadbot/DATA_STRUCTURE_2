import java.lang.*;
import java.util.*;
import java.util.HashMap;
import java.io.*;
public class VowelDetectMultithread {
	public static void main(String[] args)throws Exception {
			HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
			String str1="I am a very good boy";
			String str2="she is so pretty";
			A oa= new A();
			B ob=new B();
			oa.setMap(hm,str1);
			Thread 	ta= new Thread(oa);
			Thread tb= new Thread(ob);
			ta.start();
			hm=oa.getMap();
			ob.setMap(hm,str2);
			tb.start();
			hm=ob.getMap();
			System.out.println(hm);
	}
}
class A implements Runnable{
	HashMap<Character,Integer> as= new HashMap<Character,Integer>();
	String str;	
	
	void setMap(HashMap<Character,Integer> a,String str)throws Exception{
		this.as=a;
		this.str=str;
	}
	public void run(){
			for (int i=0;i<str.length();i++) {
				if(as.containsKey(str.charAt(i))){
					Integer k=as.get(str.charAt(i));
					as.put(str.charAt(i),k+1);
				}else{
					as.put(str.charAt(i),1);
				}
			}

		//	System.out.println(as);
	}
	HashMap<Character,Integer> getMap()throws Exception{
		System.out.println(as);
		return as;
	}
}
class B implements Runnable{
HashMap<Character,Integer> as= new HashMap<Character,Integer>();
	String str;
	void setMap(HashMap<Character,Integer> a,String str)throws Exception{
		this.as=a;
		this.str=str;
	}

	public void run(){

			for (int i=0;i<str.length();i++) {
				if(as.containsKey(str.charAt(i))){
					Integer k=as.get(str.charAt(i));
					as.put(str.charAt(i),k+1);
				}else{
					as.put(str.charAt(i),1);
				}
			}
		//	System.out.println(as);
	}
	HashMap<Character,Integer> getMap()throws Exception{
		System.out.println(as);
		return as;
	}
}