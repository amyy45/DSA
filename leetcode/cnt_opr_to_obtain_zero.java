package leetcode;

public class cnt_opr_to_obtain_zero {
    public int countOperations(int num1, int num2) {
        int opr=0;
        while (num1 != 0 && num2 != 0) {
            if(num1>=num2) {
                num1=num1-num2;
            } else {
                num2=num2-num1;
            }
            opr++;
        }
        return opr;
    }

    public static void main(String[] args) {
        cnt_opr_to_obtain_zero obj=new cnt_opr_to_obtain_zero();
        int num1=2;
        int num2=3;
        int result=obj.countOperations(num1, num2);
        System.out.println("Number of operations to obtain zero: " + result);
    }
}
