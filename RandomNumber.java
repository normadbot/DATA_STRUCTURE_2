import java.lang.*;
import java.util.*;
public class RandomNumber {
	public static void main(String [] arg){
	long LOWER_RANGE = 1000000000L; //assign lower range value
            long UPPER_RANGE = 9999999999L; //assign upper range value
             Random random = new Random();
            long randomValue = LOWER_RANGE +(long)(random.nextDouble()*(UPPER_RANGE - LOWER_RANGE));
			System.out.println(randomValue);
	}
}