
public class Factorial {

    public int factorial(int n, String type) {
        int answer = 0;
        /*
        switches between what type to use
         */
        switch (type) {
            case "iterative":
                answer = factorialIterative(n);
                break;
            case "recursive":
                answer = factorialRecursive(n);
                break;
            default:
                break;
        }
        return answer;
    }

    /**
     *
     * @param n the place to go to
     * @return n factorial
     */
    public int factorialIterative(int n) {
        int total = 1;
        /*
        multiplies together all numbers from 1 to n
         */
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        return total;
    }

    /**
     *
     * @param n the number to go to
     * @return n factorial
     */
    public int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return n;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }
}