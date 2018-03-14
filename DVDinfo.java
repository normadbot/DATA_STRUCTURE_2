import java.util.*;

public class DVDinfo implements Comparable<DVDinfo> {
		public void main(String [] args )
		{String title;
		String genre;
		String leadActor;
		@Override
		DVDinfo(String t, String g,String a){
			title=t;genre=g;leadActor=a;
		}@Override
		public String toString (){
			return title+" "+genre +" "+leadActor+"\n";
		}@Override
		public int compareTo(DVDinfo d){
			return title.compareTo(d.getTitle());
			
		}@Override
		public String getTitle(){
			return title;
		}
}
}