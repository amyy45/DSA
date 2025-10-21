package arrays;

public class move_zeros_end {
    static void moveZerosToEnd(int nums[]) {
        int j=-1;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return;

        for(int i=j+1;i<nums.length;i++) {
            if(nums[i]!=0) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.print("Array after moving zeros to the end: ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
