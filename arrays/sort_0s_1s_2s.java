package arrays;
import java.util.*;

public class sort_0s_1s_2s {
    static void sort012(ArrayList<Integer> arr) {
        int low=0, mid=0, high=arr.size()-1;
        while(mid<=high) {
            if(arr.get(mid)==0) {
                // swap arr[low] and arr[mid]
                int temp=arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            } else if(arr.get(mid)==1) {
                mid++;
            } else {
                // swap arr[mid] and arr[high]
                int temp=arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,0,1,2,0,1,1,0,2));
        sort012(arr);
        System.out.println("Sorted array: " + arr);
    }
}
