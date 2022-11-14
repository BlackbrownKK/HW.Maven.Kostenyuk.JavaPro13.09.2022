import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        TwoSumApp twoSumApp = new TwoSumApp();
        int[] nums = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(twoSumApp.twoSum(nums, 19)));

        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        System.out.println(fibonacciNumbers.fibonacciNumber(10));
        System.out.println();
        PascalsTreangle pascalsTreangle = new PascalsTreangle();
        pascalsTreangle.bildPascalsTreangle(7);
        }
    }


