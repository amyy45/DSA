package sorting;

public class bubble_sort {
    static void bubblesort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        bubblesort(arr);
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
