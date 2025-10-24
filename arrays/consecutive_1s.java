package arrays;

public class consecutive_1s {
    static int MaxConsecutiveOnes(int nums[]) {
        int count =0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                count++;
                maxcount=Math.max(maxcount,count);
            } else {
                count=0;
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1};
        System.out.println("The maximum consecutive 1s are: " + MaxConsecutiveOnes(nums));
    }
}
