package basic_math;

import java.util.ArrayList;

public class prime {
    public static boolean isPrime(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        int sqrtN= (int)Math.sqrt(n);
        for(int i=1;i<sqrtN;i++) {
            if(n%i==0) {
                divisors.add(i);
                if(i!=n/i) {
                    divisors.add(n/i);
                }
            }
        }
        return divisors.size()==2;
    }

    public static void main(String[] args) {
        int n=29;
        System.out.println("N: " + n);
        if(isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
