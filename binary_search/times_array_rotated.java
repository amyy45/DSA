public class times_array_rotated{
    public static int noOfTimesArrayRotated(int[] nums) {
        int low=0,high=nums.length-1;
        while(low<high) {
            int mid=(low+high)/2;
            //if mid is greater than high, min lies in right of mid
            if(nums[mid]>nums[high]) {
                low=mid+1;
            } else {
                //else smallest lies in left of mid or mid itself
                high=mid;
            }
        }
        //when low==high, we have found the smallest element
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int result = noOfTimesArrayRotated(nums);
        System.out.println("The array has been rotated " + result + " times.");
    }
}
