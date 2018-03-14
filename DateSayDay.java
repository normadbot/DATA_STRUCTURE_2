import java.lang.*;
import java.util.*;
public class DateSayDay{
	public static void main(String [] args){
		int day=0;
		int month=0;
		int year=0;
		int odd=0;
		String a[]={"sunday","Monday","Tuesday","wednesday","Thursday","Friday","saturday"};
		int mo[]={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		System.out.print("enter day: ");
		day=sc.nextInt();
		System.out.print("enter Month: ");
		month=sc.nextInt();
		System.out.print("enter Year: ");
		year=sc.nextInt();
		int y=year-1;
		int m=month-1;
		boolean leapyear=false;
		int yroc=y%400;
		int incy=yroc%100;
		int nhun=yroc/100;
		odd+=nhun*5;
		int nly=incy/4;
		int nonly=incy-nly;
		odd+=nonly*1+nly*2;
		odd+=day;
		for(int i=0;i<month-1;i++){
			odd+=mo[i];	
		}
	
		if(month>2 && (incy+1)%4==0 ){
			odd+=1;
		}
	
		int d=odd%7;
		System.out.println(a[d]);
	}
}
