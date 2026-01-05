import java.util.*;
public class find_x_in_sorted_array{
    public static int findX(int[] nums, int low, int high, int target) {
        if(low>high) return -1;
        int mid=(low+high)/2;
        if(nums[mid]==target) return mid;
        else if(target>nums[mid])
            return findX(nums,mid+1,high,target);
        else 
            return findX(nums,low,mid-1,target);
    }

    public static int search(int[] nums, int target) {
        return findX(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = search(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}