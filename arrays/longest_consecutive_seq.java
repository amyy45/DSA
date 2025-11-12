package arrays;
import java.util.*;
public class longest_consecutive_seq {
    static int longestSuccessiveElements(int arr[]) {
        int n=arr.length;
        if(n==0) return 0;
        Arrays.sort(arr);
        int lastSmaller=Integer.MIN_VALUE;
        System.out.println(lastSmaller);
        int count=0;
        int longest=1;
        for(int i=0;i<n;i++) {
            if(arr[i]-1==lastSmaller) {
                count++;
                lastSmaller=arr[i];
            } else if(arr[i]!=lastSmaller) {
                count=1;
                lastSmaller=arr[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        int result = longestSuccessiveElements(arr);
        System.out.println("Length of the longest consecutive elements sequence: " + result);
    }
}
