package basic_recursion;
import java.util.*;

public class reverse_array {
    static void printArray(Integer arr[], int n) {
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void reverseArray(int arr[], int start, int end) {
        if(start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverseArray(arr,start+1,end-1);
        }
    }

    static void rArray(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        Integer arr[] = {5,8,3,4,6,5,9};
        int n=arr.length;
        rArray(arr);
        printArray(arr,n);
    }
}
