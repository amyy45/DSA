package arrays;

import java.util.*;
public class count_subarray_sum {
    static int countSubarraysWithSumK(int nums[], int k) {
        Map<Integer, Integer> mpp = new HashMap<>();   
        int n=nums.length;
        int sum=0;
        int count=0;
        mpp.put(0,1);
        for(int i=0;i<n;i++) {
           sum+=nums[i];
           int rem=sum-k;
           count+=mpp.getOrDefault(rem,0);
           mpp.put(sum,mpp.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[]={1,1,1};
        int k=2;
        System.out.println("The count of subarrays with sum k is: " + countSubarraysWithSumK(nums,k));
    }
}
