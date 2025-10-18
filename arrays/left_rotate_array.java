package arrays;

public class left_rotate_array {
    static void leftRotate(int arr[]) {
        int n=arr.length;
        int f=arr[0];
        for(int i=1;i<=n-1;i++) {
            arr[i-1]=arr[i];
        }
        arr[n-1]=f;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        leftRotate(arr);
        System.out.print("Array after left rotation: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
