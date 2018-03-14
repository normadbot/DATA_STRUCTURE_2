import java.lang.*;


public class ConvertStringToNumber {

    public static void main(String[] args) {
        try {
            String s = "FOOBAR";
            int i = Integer.parseInt(s);
            // this line of code will never be reached
            System.out.println("int value = " + i);
        }
        catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }

}