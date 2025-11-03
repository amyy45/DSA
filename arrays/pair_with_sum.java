package arrays;
import java.util.*;

public class pair_with_sum {
    static String hasPairWithSum(int nums[], int target) {
        Map<Integer, Boolean> seen = new HashMap<>();
        for(int num : nums) {
            int complement = target - num;
            if(seen.containsKey(complement)) {
                return "Yes";
            }
            seen.put(num, true);
        }
        return "No";
    }

    static int[] twoSumIndices(int nums[], int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1}; // return -1 if no pair found
    }

     public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        // 1st Variant
        String result1 = hasPairWithSum(arr, target);
        System.out.println("Result (YES/NO): " + result1);

        // 2nd Variant
        int[] result2 = twoSumIndices(arr, target);
        System.out.println("Indices: [" + result2[0] + ", " + result2[1] + "]");
    }
}
