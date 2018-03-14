import java.lang.*;

public class Of {
 public int cd(int x){
 int r=1;
 r+=x;
 if((x>4)&&(x<10)){
 r+=2*x;
 }else if (x<=4){
 r+=3*x;
 }else {
 r+=4*x;
 }
 r+=5*x;
 return r;
 }


 public static void main(String [] args ){
  Of a = new Of();
  System.out.println(a.cd(11));
 
 }

}



