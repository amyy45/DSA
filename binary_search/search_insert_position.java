public class search_insert_position {
    public static int searchInsert(int[] nums,int target) {
        int low=0, high=nums.length-1;
        int ans=nums.length;
        while(low<=high) {
            int mid=(low+high)/2;
            if(nums[mid]>=target) {
                ans=mid;
                high=mid-1;
            } else {
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,7};
        int target = 6;
        int result = searchInsert(nums, target);
        System.out.println("The insert position of " + target + " is: " + result);
    }
}
