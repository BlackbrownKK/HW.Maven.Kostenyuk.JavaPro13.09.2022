import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumbersTest {

    FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
@Test
    public void fibonacciNumbersTest() {
        int num = 34;
        int result = 5702887;
        Assert.assertEquals(result, fibonacciNumbers.fibonacciNumber(num));
    }
}

