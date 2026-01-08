public class min_sorted_array {
    public static int findMin(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high) {
            int mid=(low+high)/2;
            if(nums[mid]>nums[high]) {
                low=mid+1;
            } else {
                high=mid;
            }
        }
        return nums[low];
    }
    
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int result = findMin(nums);
        System.out.println("The minimum element in the rotated sorted array is: " + result);
    }
}
