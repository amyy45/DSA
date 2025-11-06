package arrays;

public class max_sum_subarray {
    static int maxSumSubarray(int nums[]) {
        int n=nums.length;
        int sum=0;
        int start=0;
        int ansStart=-1;
        int ansEnd=-1;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if(sum==0) start=i;
            sum+=nums[i];
            if(sum>maxSum) {
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0) {
                sum=0;
            }
        }
        System.out.print("the subarray is: [");
        for(int i=ansStart;i<=ansEnd;i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum sum of subarray is: " + maxSumSubarray(nums));
    }
}
