public class peak_element {
    public static int findPeakElement(int[] nums) {
        //num[i] peak element : nums[i-1]<nums[i]>nums[i+1]
        //if more than one peak element, return any one of them
        int low=0,high=nums.length-1;
        while(low<high) {
            int mid=(low+high)/2;
            //if mid ele is greater then it's neighbor
            if(nums[mid]>nums[mid+1]) {
                //peak element lies in left of mid or mid itself
                high=mid;
            } else {
                //peak element lies in right of mid
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,5,1};
        int result = findPeakElement(nums);
        System.out.println("The index of a peak element is: " + result);
    }
}
