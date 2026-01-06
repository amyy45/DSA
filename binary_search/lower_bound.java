public class lower_bound {
    public static int lowerBound(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length; // Default to length if target is greater than all elements
        while(low<high) {
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
        int[] nums = {1, 2,2,3};
        int target = 2;
        int result = lowerBound(nums, target);
        System.out.println("The lower bound index of " + target + " is: " + result);
    }
}
