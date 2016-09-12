import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Danylo Pidtiagyn on 12.09.2016.
 */
public class Method {

    /*
    Calculate sum of positive values in array
    If array is empty return 0
    If array contains only negative numbers return 0
    */
    public int Calculate (int[] array){
        int arrayLength = Array.getLength(array);
        int sum = 0;

        //array is empty check
        if (arrayLength == 0) return 0;

        //contains only negative numbers check
        boolean containPositive = false;
        for (int i = 0; i < arrayLength; i++){
            if (array[i] > 0) containPositive = true;
        }
        if (!containPositive) return 0;

        //Calculate result
        for (int i = 0; i < arrayLength; i++){
            sum = sum + array[i];
        }
        return sum;
    }
}
