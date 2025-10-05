package basic_math;

public class armstrong {
    static boolean isArmstrong(int x) {
        int k=String.valueOf(x).length();
        int sum=0;
        int original=x;
        while(x>0) {
            int lastDigit=x%10;
            sum=sum+(int)Math.pow(lastDigit, k);
            x=x/10;
        }
        return sum==original ? true : false;
    }

    public static void main(String[] args) {
        int num=153;
        System.out.println("Number: " +num);
        if(isArmstrong(num)) {
            System.out.println(num + "is an Armstrong number");
        } else {
            System.out.println(num + "is not an Armstrong number");
        }
    }
}
