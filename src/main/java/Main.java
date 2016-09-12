import java.util.Arrays;

/**
 * Created by Danylo Pidtiagyn on 12.09.2016.
 */
public class Main {
    public static void main (String[] args){
        int[] array = {66,88,10,4,5,0,-46,13};
        int[] sum = {4,5,-26,-7, 15};

        Method Method = new Method();
        int res = Method.Calculate(sum);
        System.out.println("Array before sort = " + Arrays.toString(array));




    }
}
