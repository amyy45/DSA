public class element_rotated_sorted_array {
    public static int search(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(nums[mid]==target) return mid;
            //if left is sorted
            if(nums[low]<=nums[mid]) {
                //check if target lies in left
                if(target>=nums[low] && target<=nums[mid]) {
                    high=mid-1;
                } else {
                    low=mid+1;
                }
            }
            //if right is sorted
            else {
                //check if target lies in right
                if(target>=nums[mid] && target<=nums[high]) {
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result = search(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
