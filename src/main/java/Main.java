import java.util.Arrays;

/**
 * Created by 1 on 11.09.2016.
 */
public class Main {
    public static void main (String[] args){
        int[] array = {59,56,100,3,2,0,-40,10};
        int[] sum = {2,4,-2,-4, 10};

        Method Method = new Method();
        int res = Method.Calculate(sum);
        System.out.println("Array before sort = " + Arrays.toString(array));




    }
}
