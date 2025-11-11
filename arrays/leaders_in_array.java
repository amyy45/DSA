package arrays;
import java.util.*;

public class leaders_in_array {
    public static ArrayList<Integer> printLeaders(int nums[]) {
        int n=nums.length;
        ArrayList<Integer> Leaders = new ArrayList<>();
        int max=nums[n-1];
        Leaders.add(max);
        for(int i=n-2;i>=0;i--) {
            if(nums[i]>=max) {
                max=nums[i];
                Leaders.add(max);
            }
        }
        return Leaders;
    }

    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> leaders = printLeaders(nums);
        Collections.sort(leaders, Collections.reverseOrder());
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
