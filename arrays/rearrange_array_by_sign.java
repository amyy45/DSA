package arrays;

public class rearrange_array_by_sign {
    static int[] rearrange(int nums[]) {
        int n=nums.length;
        int[] rev=new int[n];
        int posIndex=0;
        int negIndex=1;
        for(int i=0;i<n;i++) {
            if(nums[i]>=0) {
                rev[posIndex]=nums[i];
                posIndex+=2;
            }
            else {
                rev[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        int nums[]={1,2,-4,-5};
        int[] result=rearrange(nums);
        System.out.print("The rearranged array is: [");
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("]");
    }
}
