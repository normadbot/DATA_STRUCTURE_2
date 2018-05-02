import java.lang.*;
import java.util.*;
enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumTest1{
	Day day;
	EnumTest1(Day day){
		this.day=day;
	}
	public void dayisLike(){
		switch(day){
			case MONDAY:
				System.out.println("MONDAY are bad");
				break;
			default: System.out.println("Here is lol");
				break;	
		}
	}
	public static void main(String[] args) {
		String str="MONDAY";
		EnumTest1 t1=new EnumTest1(Day.valueOf(str));
		EnumSet<Day> set1,set2,set3,set4;
		set1= EnumSet.of(Day.MONDAY,Day.TUESDAY,Day.FRIDAY);
		set2=EnumSet.complementOf(set1);
		set3= EnumSet.allOf(Day.class);
		set4= EnumSet.range(Day.MONDAY,Day.THURSDAY);
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		System.out.println(set4);
//		t1.dayisLike();
	}
}