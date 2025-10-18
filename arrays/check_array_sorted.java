package arrays;

public class check_array_sorted {
    static boolean isSorted(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean optimized_isSorted(int arr[]) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    //leetcode optimized 0ms solution
    //return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
    //An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i]<nums[(i-1+n)%n]) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5};
        if(optimized_isSorted(arr)) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
