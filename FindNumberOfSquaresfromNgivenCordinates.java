import java.lang.*;
import java.util.*;
public class FindNumberOfSquaresfromNgivenCordinates{
	static int count=0;
		public static void main(String [] args){
			boolean ind[]= new boolean[7];
			int a[]= new int[7];
			for(int i=0;i<7;i++){
				a[i]=i;
			}
			int n=4;
			
			int x[]={0,0,1,1,1,2,2};
			int y[]={0,1,0,1,2,1,2};
		//	checkforSquare(temp,x,y);
			chooseCordinate(a,0,0,ind,n,x,y);
			System.out.println(count);
		}
		static void chooseCordinate(int a[],int start,int cur,boolean b[],int n,int x[],int y[]){
			if(cur==n){
					int c[]=new int[4];
					int x1=0;
				for(int i=0;i<a.length;i++){
					if(b[i]==true){
						c[x1++]=a[i];
					} 
				}
			//	System.out.println(Arrays.toString(c));
				boolean t=checkforSquare(c,x,y);
				if(t==true)count++;
				return;
			}
			if(start==a.length)return;
			b[start]=true;
			chooseCordinate(a,start+1,cur+1,b,n,x,y);
			b[start]=false;
			chooseCordinate(a,start+1,cur,b,n,x,y);
		}
		static	 double dist(int x1,int x2,int y1,int y2){
			return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		}
		static boolean checkforSquare(int c[],int x[],int y[]){
				int px=x[c[0]];
				int py=y[c[0]];
				int p1x=x[c[1]];
				int p1y=y[c[1]];
				int p2x=x[c[2]];
				int p2y=y[c[2]];
				int p3x=x[c[3]];
				int p3y=y[c[3]];
				
				double d2=dist(px,p1x,py,p1y);
				double d3=dist(px,p2x,py,p2y);
				double d4=dist(px,p3x,py,p3y); 
				if(d2==d3 && Math.sqrt(2)*d2==d4){
					double d=dist(p1x,p3x,p1y,p3y);		
					return(d==dist(p2x,p3x,p2y,p3y)&& d==d2);
				}
				if(d3==d4 && Math.sqrt(2)*d3==d2){
					double d=dist(p1x,p2x,p1y,p2y);
					return(d==dist(p1x,p3x,p1y,p3y)&& d==d3);
				}
				if(d2==d4 && Math.sqrt(2)*d2==d3){
					double d=dist(p1x,p2x,p1y,p2y);
					return(d==dist(p2x,p3x,p2y,p3y)&& d==d2);
				}
				return false;
		}
}
