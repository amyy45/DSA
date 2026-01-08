public class single_ele_in_array {
    public static int searchSingleElement(int[] nums) {
        int n=nums.length;
        //when only one element 
        if(n==1) return nums[0];
        //when first ele is unique
        if(nums[0]!=nums[1]) return nums[0];
        //when last ele is unique
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1,high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
                return nums[mid];
            } else if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1])) {
                //single element lies in right
                low=mid+1;
            } else {
                //single element lies in left
                high=mid-1;
            }
        }
        //return -1 if no single element found
        return -1;
    }

    public static void main(String[] args) {
        int nums[]={3,3,7,7,10,11,11};
        int result=searchSingleElement(nums);
        if(result!=-1) {
            System.out.println("The single element in the array is: " + result);
        } else {
            System.out.println("No single element found in the array.");
        }
    }
}
