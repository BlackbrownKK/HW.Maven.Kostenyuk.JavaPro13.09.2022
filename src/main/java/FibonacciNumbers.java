public class FibonacciNumbers {
    public int fibonacciNumber(int num) {
        //recursive solution
        if (num == 0 || num == 1) return num;
        return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
    }
}
