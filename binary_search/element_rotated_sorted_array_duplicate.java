public class element_rotated_sorted_array_duplicate {
    public static boolean searchInSortedArrayII(int[] nums, int target) {
        int low=0,high=nums.length-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(nums[mid]==target) return true;
            //if left is sorted
            if(nums[low]<nums[mid]) {
                //check if target lies in left
                if(target>=nums[low] && target<=nums[mid]) {
                    high=mid-1;
                } else {
                    low=mid+1;
                }
            }
            //if right is sorted
            else if(nums[mid]<nums[high]) {
                //check if target lies in right
                if(target>=nums[mid] && target<=nums[high]) {
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            }
            //if duplicates are present
            else {
                if(nums[low]==nums[mid] && nums[mid]==nums[high]) {
                    low++;
                    high--;
                    continue;
                } 
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {7,8,1,2,3,3,3,4,5,6};
        int target = 0;
        boolean result = searchInSortedArrayII(nums, target);
        if (result) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
