package basic_math;

public class palindrome {
    static boolean isPalindrome(int n) {
        int revNum=0;
        int dup=n;
        while(n>0) {
            int lastDigit=n%10;
            revNum=revNum*10+lastDigit;
            n=n/10;
        }
        return dup==revNum;
    }

    public static void main(String[] args) {
        int num=1551;
        System.out.println("N: " + num);
        boolean isPal=isPalindrome(num);
        if(isPal) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
