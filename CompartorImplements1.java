import java.lang.*;
import java.util.*;
class Movie implements Comparable<Movie>{
	private double rate;
	private String name;
	private int year;
	public Movie(String nm,double r,int y){
		this.name=nm;
		this.rate=r;
		this.year=y;
	}
	public int compareTo(Movie m)
    {
        return this.year - m.year;
    }
 
	public String getName(){
		return name;
	}
	public int getYear(){
		return year;
	}
	public double getRating(){
		return rate;
	}
}
class RatingComparator implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2){
			if(m1.getRating()<m2.getRating())return -1;
			else if(m1.getRating()>m2.getRating()) return 1;
			return 0;
	}
}

class NameComparator implements Comparator<Movie>{
	public  int compare(Movie m1,Movie m2){
			return m1.getName().compareTo(m2.getName());
	}
}
public class CompartorImplements1{
	public static void main(String[] args) {
			ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        RatingComparator rtc= new RatingComparator();
       
        NameComparator ntc = new NameComparator();
        System.out.println("Sorting by rating\n ");
        Collections.sort(list,rtc);
        for (Movie l : list) {
        	System.out.println(l.getName()+" "+l.getYear()+" "+l.getRating());
        }
        System.out.println("Sorting by Name\n");
        Collections.sort(list,ntc);
		for (Movie l : list) {
        	System.out.println(l.getName()+" "+l.getYear()+" "+l.getRating());
        }
        System.out.println("Sorting by Year\n");
        Collections.sort(list);
        for (Movie l : list) {
        	System.out.println(l.getName()+" "+l.getYear()+" "+l.getRating());
        }

	}
}