package basic_math;
public class digits_count {
    static int countDigits(int n) {
        int cnt = (int) (Math.log10(n) + 1);
        return cnt;
    }
    public static void main(String[] args) {
        int n = 3654892;
        System.out.println("N: " + n);
        int digits=countDigits(n);
        System.out.println("Number of digits: " + digits);
    }
}
