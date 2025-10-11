package sorting;

public class insertion_sort {
    static void insertionsort(int arr[]) {
        int n=arr.length;
        for(int j=0;j<=n-1;j++) {
            while(j>0 && arr[j-1]> arr[j]) {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        insertionsort(arr);
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
