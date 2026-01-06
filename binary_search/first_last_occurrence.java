public class first_last_occurrence {
    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        // Find first occurrence
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                first = mid;
                high = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find last occurrence
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                last = mid;
                low = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] result = searchRange(nums, target);
        System.out.println("The first and last occurrence of " + target + " are at indices: " + result[0] + " and " + result[1]);
    }
}
