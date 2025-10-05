package basic_math;

public class gcd {
    static int computeGCD(int a, int b) {
        while(a>0 && b>0) {
            if(a>b) {
                a=a%b;
            }else {
                b=b%a;
            }
        }
        if(a==0) {
            return b;
        } else {
            return a;
        }
    }
    
    public static void main(String[] args) {
        int n1=20, n2=30;
        int gcd=computeGCD(n1,n2);
        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}
