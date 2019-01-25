
public class Fibonacci {

    public int fibonacci(int n, String type) {
        int answer = 0;
        /*
         * Switches to the type
         */
        switch (type) {
            case "iterative":
                answer = fibonacciIterative(n);
                break;
            case "recursive":
                answer = fibonacciRecursive(n);
                break;
            default:
                break;
        }
        return answer;
    }

    /**
     *
     * @param n the place to go to
     * @return fibonacci to that place n
     */
    public int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    /**
     *
     * @param n the place to go to
     * @return fibonacci at that place n
     */
    public int fibonacciIterative(int n) {
        int lastDigit = 1;
        int secLastDigit = 0;
        int total = 0;

        if (n == 1) {
            return 1;
        } else {
            /*
             * iterates the last two digits to always remember what
             * they are and add them together to get the new total
             */
            for (int i = 0; i < n - 1; i++) {
                total = lastDigit + secLastDigit;
                secLastDigit = lastDigit;
                lastDigit = total;
            }
            return total;
        }
    }
}