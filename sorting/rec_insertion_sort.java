package sorting;

public class rec_insertion_sort {
    static void rec_insertionSort(int arr[], int i ,int n) {
        if(i==n) return;
        int j=i;
        while(j>0 && arr[j-1]> arr[j]) {
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        rec_insertionSort(arr,i+1,n);
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        rec_insertionSort(arr,0,arr.length);
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
