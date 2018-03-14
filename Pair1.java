import java.lang.*;
import java.util.*;
import javafx.util.Pair;
public class Pair1{
	public static Pair<String,Integer> getMax(ArrayList<Pair<String,Integer> > l ){
		int max=Integer.MIN_VALUE;
		Pair<String,Integer> ans= new Pair<String,Integer>("",0);
		for(Pair<String,Integer> tem:l){
			int val=tem.getValue();
			if(val > max){
				max=val;
				ans=tem;
			}
		}
		return ans;
	}
		public static void main(String [] args){
			ArrayList<Pair<String,Integer>> l = new ArrayList<Pair<String,Integer>>();
			l.add(new Pair <String,Integer>("A",90));
			l.add(new Pair <String,Integer>("B",96));
			l.add(new Pair <String,Integer>("C",56));
			l.add(new Pair <String,Integer>("D",66));
			l.add(new Pair <String,Integer>("E",70));
			
			Pair <String,Integer> ans= getMax(l);
			System.out.println(ans.getKey()+" is top scorer "+"with score of "+ans.getValue()); 
		}
}