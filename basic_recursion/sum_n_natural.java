package basic_recursion;

public class sum_n_natural {
    static int sumNnatural(int n) {
        if(n==0) {
            return 0;
        }
        return n+sumNnatural(n-1);
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println("N: " + n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sumNnatural(n));
    }
}
