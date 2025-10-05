package basic_recursion;

public class factorial {
    static int fact(int n) {
        if (n==0) {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println("N: " + n);
        System.out.println("Factorial of " + n + " is: " + fact(n));
    }
}
