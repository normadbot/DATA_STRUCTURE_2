import java.lang.*;
import java.util.*;
import java.util.Map;
import java.util.LinkedHashMap;

public class FirstNonRepeatingChar{
		public static void main(String [] args){
			String s1="abcdaadb";
			String s2="abcd";
			String s3="aabbccdd";
			firstNonRepeatingChar(s3);
		}
		static void firstNonRepeatingChar(String s){
			Map<Character,Integer> map= new LinkedHashMap<>(s.length());
			char c[]=s.toCharArray();
			for(Character ch : c){
				if(map.containsKey(ch)){
					map.put(ch,map.get(ch)+1);
				}else{
					map.put(ch,1);
				}
			}
			int q=0;
			for(Character x:c){
				if(map.get(x)==1){
					System.out.println(x);
					q=1;
					break;
				}
			}
			if(q==0){
				System.out.println("-1");
			}
			
			
		}
}