package arrays;

public class find_missing_no_array {
    //works when 0 isn't present in the array
    static int findMissing(int nums[]) {
        int n=nums.length+1; //since one number is missing
        int sum=n*(n+1)/2; //sum of first n natural numbers
        int actualsum=0;
        for(int i=0;i<nums.length;i++) {
            actualsum+=nums[i];
        }
        return sum-actualsum;
    }

    //using xor
    static int findMissingXOR(int nums[]) {
        int n=nums.length;
        int xor1=0; //xor of all elements in the array
        int xor2=0; //xor of all elements from 0 to n
        for(int i=0;i<n;i++) {
            xor1=xor1^nums[i];
        }
        for(int i=0;i<=n;i++) {
            xor2=xor2^i;
        }
        return xor1^xor2;
    }

    public static void main(String[] args) {
        int nums[]={0,1,2,4,5,6};
        System.out.println("The missing number is: " + findMissingXOR(nums));
    }
}
