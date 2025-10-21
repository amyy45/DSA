package arrays;

public class rotate_array_by_k {
    static void reverse(int arr[], int start, int end) {
        while(start<=end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void rotate(int arr[], int n, int k) {
        // Handle cases where k is greater than n
         k=k%n;
        // Reverse the first k elements
        reverse(arr,0,n-k-1);
        // Reverse the remaining n-k elements
        reverse(arr,n-k,n-1);
        // Reverse the whole array
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int k = 2; // Number of positions to rotate

        rotate(arr, n, k);

        System.out.print("Array after rotating by " + k + " positions: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
