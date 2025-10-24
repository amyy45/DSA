package arrays;

public class no_appears_once {
    //using xor
    //a^a=0 and a^0=a
    //so all the numbers that appear twice will cancel out each other and the number that appears once will remain
    static int findNumberThatAppearsOnce(int nums[]) {
        int result=0;
        for(int i=0;i<nums.length;i++) {
            result=result^nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]={2,3,5,4,5,3,4};
        System.out.println("The number that appears once is: " + findNumberThatAppearsOnce(nums));
    }
}
