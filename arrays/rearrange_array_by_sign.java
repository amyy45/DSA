package arrays;
import java.lang.reflect.Array;
import java.util.*;
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
    
    //varient 2
    static int[] rearrange2(int nums[]) {
        int n = nums.length;
        
    }
    public static void main(String[] args) {
        int nums[]={1,2,-3,-1,-2,-3};
        int[] result=rearrange2(nums);
        System.out.print("The rearranged array is: [");
        for(int i=0;i<result.length;i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("]");
    }
}
