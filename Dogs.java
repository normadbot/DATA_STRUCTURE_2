public class Dogs extends Animals {
 public static void dostuff() {
  System.out.println("d");
  }
  public static void main(String [] args) {
 Animals
 []a={new Dogs(),new Dogs(),new Dogs()};
  for(int x =0; x<a.length;x++)
  a[x].dostuff();
  
  }  
  

}