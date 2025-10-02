public class merge_sort {
    void combine(int[] arr, int beg, int mid, int end) {
        int temp[] = new int[end - beg + 1];
        int i=0 , l=beg, r=mid+1;
        while(l<=mid && r<=end) {
            if(arr[l]<=arr[r]) {
                temp[i++] = arr[l++];
            } else {
                temp[i++] = arr[r++];
            }
        }
        while(l<=mid) {
            temp[i++] = arr[l++];
        }
        while(r<=end) {
            temp[i++] = arr[r++];
        }
        for(int j=0;j<i;j++) {
            arr[beg+j] = temp[j];
        }
    }
    void mergeSort(int[] arr ,int beg, int end) {
        if(beg==end) {
            return;
        }

        int mid = (beg + end) / 2;
        mergeSort(arr, beg, mid);
        mergeSort(arr, mid + 1, end);
        combine(arr, beg, mid, end);
    }
        
    void sortArray(int[] arr, int n) {
        mergeSort(arr, 0, n-1);
    }

    public static void main(String[] args) {
        merge_sort obj = new merge_sort();
        int[] arr = {5,4,3,2,1};
        int n = arr.length;
        obj.sortArray(arr, n);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
