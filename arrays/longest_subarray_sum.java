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

    static int LongestSubarrayWithSumK2(int nums[], long k) {
        int n=nums.length;
        int left=0,right=0,maxLen=0;
        long sum=nums[0];
        while(right<n) {
            while(left<=right && sum>k) {
                sum-=nums[left];
                left++;
            }
            if(sum==k) {
                maxLen=Math.max(maxLen,right-left+1);
            }
            right++;
            if(right<n) {
                sum+=nums[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[]={2,3,5};
        long k=5;
        System.out.println("The length of longest subarray with sum k is: " + LongestSubarrayWithSumK2(nums,k));
    }
}

