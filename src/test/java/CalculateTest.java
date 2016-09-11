import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 1 on 11.09.2016.
 */
public class CalculateTest {

    Method Method = new Method();
    int result;
    int[] empty = {};
    int[] negative = {-2, -4, -6, -10};
    int[] sum = {2,4,-2,-4, 10};

    @Test
    public void CalculateEmptyArrayTest(){
        result = Method.Calculate(empty);
        Assert.assertEquals(0, result);
    }

    @Test
    public void CalculateArrayWithOnlyNegativeNumbersTest(){
        result = Method.Calculate(negative);
        Assert.assertEquals(0, result);
    }

    @Test
    public void CalculateArrayWithAllCorrectNumbersTest(){
        result = Method.Calculate(sum);
        Assert.assertEquals(10, result);
    }

}
