package arrays;

public class sec_lar_smal_element {
    static int secondSmallest(int arr[]) {
        int n=arr.length;
        if(n<2) {
            return -1; // Not enough elements
        }

        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i]<small) {
                secondSmall=small;
                small=arr[i];
            } else if (arr[i]<secondSmall && arr[i]!=small) {
                secondSmall=arr[i];
            }
        }
        return secondSmall;
    }

    static int secondLargest(int arr[]) {
        int n=arr.length;
        if(n<2) {
            return -1; // Not enough elements
        }

        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;

        for(int i=0;i<n;i++) {
            if(arr[i]>large) {
                secondLarge=large;
                large=arr[i];
            } else if (arr[i]>secondLarge && arr[i]!=large) {
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Smallest element is: " + secondSmallest(arr));
        System.out.println("Second Largest element is: " + secondLargest(arr));
    }
}