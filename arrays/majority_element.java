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


    public static void main(String[] args) {
        int[] arr = {4,4,2,4,3,4,4,3,2,4};
        System.out.println("Majority Element: " + majorityElement(arr));
    }
}
