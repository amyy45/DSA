package basic_math;

public class rev_num {
    static int revNum(int n) {
        int revNum =0;
        while(n>0) {
            int lastDigit=n%10;
            revNum=revNum*10+lastDigit;
            n=n/10;
        }
        return revNum;
    }

    public static void main(String[] args) {
        int num=7789;
        System.out.println("N: " + num);
        int rev=revNum(num);
        System.out.println("Reversed N: " + rev);
    }
}
