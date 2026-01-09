public class sqrt_of_number {
    public static int sqrtBinSearch(int n) {
        if(n<2) return n;
        int low=1, high=n;
        int ans=0;
        while(low<=high) {
            int mid=(low+high)/2;
            int midSquare=mid*mid;
            if((midSquare<n) || (midSquare==n)) {
                ans=mid;
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 1;
        int result = sqrtBinSearch(n);
        System.out.println("The integer square root of " + n + " is: " + result);
    }
}
