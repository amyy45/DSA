package sorting;

public class selection_sort {
    static void selectionSort(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[j]<arr[i]) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted array");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
