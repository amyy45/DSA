package sorting;

public class rec_bubble_sort {
    static void rec_bubble_sort(int arr[],int n) {
        if(n==1) return;
        for(int j=0;j<n-1;j++) {
            if(arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        rec_bubble_sort(arr,n-1);
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        rec_bubble_sort(arr,arr.length);
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
