package arrays;

import java.util.*;

public class longest_subarray_sum {
    static int LongestSubarrayWithSumK(int nums[], long k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();    
        int n=nums.length;
        int sum=0;
        int maxLen=0;
        // Traverse through the array
        for(int i=0;i<n;i++) {
           sum+=nums[i];
           if(sum==k) {
            maxLen=Math.max(maxLen,i+1);
           }
           long rem=sum-k;
           if(prefixSum.containsKey(rem)) {
            int len=i-prefixSum.get(rem);
            maxLen=Math.max(maxLen,len);
           }
           if(!prefixSum.containsKey(sum)) {
            prefixSum.put(sum,i);
           }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[]={2,3,5,1,9};
        long k=10;
        System.out.println("The length of longest subarray with sum k is: " + LongestSubarrayWithSumK(nums,k));
    }
}

