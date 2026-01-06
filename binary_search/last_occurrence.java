public class last_occurrence {
    public static int lastOccurrence(int[] nums, int target) {
        int low=0, high=nums.length-1;
        int ans=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(nums[mid]==target) {
                ans=mid;
                low=mid+1;
            } else if(nums[mid]<target) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,5};
        int target = 2;
        int result = lastOccurrence(nums, target);
        if(result != -1) {
            System.out.println("The last occurrence of " + target + " is at index: " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }
}
