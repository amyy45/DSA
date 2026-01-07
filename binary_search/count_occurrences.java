public class count_occurrences {
    //total occurrences= last occurence -first occurrence +1
    public static int[] firstAndLastPosition(int[] nums, int target, int n) {
        int first = -1;
        int last = -1;

        // Find first occurrence
        int low = 0, high = n - 1;
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
        high = n- 1;
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

    public static int count(int[] nums, int target, int n) {
        int[] positions=firstAndLastPosition(nums, target, n);
        if(positions[0]==-1) return 0;
        return positions[1]-positions[0]+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 2, 2, 3};
        int target = 2;
        int n = 8;
        int result = count(nums, target, n);
        System.out.println("The count of occurrences of " + target + " is: " + result);
    }
}