public class floor_ceil {
    public static int floor(int nums[],int target) {
        int low=0, high=nums.length-1;
        int ans=-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(nums[mid]<=target) {
                ans=mid;
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return ans;
    }
    public static int ceil(int nums[],int target) {
        int low=0, high=nums.length-1;
        int ans=-1;
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
        int[] nums = {3,4,4,7,8,10};
        int target = 8;
        int floorIndex = floor(nums, target);
        int ceilIndex = ceil(nums, target);
        if(floorIndex != -1) {
            System.out.println("Floor of " + target + " is: " + nums[floorIndex]);
        } else {
            System.out.println("No floor found for " + target);
        }
        if(ceilIndex != -1) {
            System.out.println("Ceil of " + target + " is: " + nums[ceilIndex]);
        } else {
            System.out.println("No ceil found for " + target);
        }
    }
}
