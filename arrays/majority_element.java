package arrays;

import java.util.*;

public class majority_element {
    static int majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount = nums.length / 2;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) > majorityCount) {
                return num;
            }
        }
        return -1;
    }
    
    //moore's voting algorithm
    static int majorityElement2(int[] nums) {
        int n=nums.length;
        int count=0;
        int element=0;
        for(int i=0;i<n;i++) {
            if(count==0) {
                count=1;
                element=nums[i];
            } else if(nums[i]==element) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        System.out.println("Majority Element: " + majorityElement(arr));
    }
}
