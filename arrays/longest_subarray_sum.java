package arrays;

import java.util.Map;

public class longest_subarray_sum {
    static int LongestSubarrayWithSumK(int nums[], long k) {
        int n=nums.length;
        int left=0, right=0;
        long sum=0;
        int maxLen=0;
        while (right<n) {
            while(left<=right && sum>k ) {
                sum-=nums[left];
                left++;
            }

            if(sum==k) {
                maxLen=Math.max(maxLen, right-left+1);
            }

            right++;
            if(right<n) {
                sum+=nums[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[]={10,5,2,7,1,9};
        long k=15;
        System.out.println("The length of longest subarray with sum k is: " + LongestSubarrayWithSumK(nums,k));
    }
}

