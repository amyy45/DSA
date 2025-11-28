package arrays;

import java.util.*;

public class majority_ele_3 {
    static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int majorityCount=nums.length/3;
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,2,1,1};
        System.out.println("Majority Elements: " + majorityElement(arr));
    }
}
