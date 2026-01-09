public class nth_root_number {
    //nth root of m is defined as a number x such that x^n=m , if nth root not an integer return -1
    public static int nthRoot(int n, int m) {
        int low=1, high=m;
        while(low<=high) {
            int mid=(low+high)/2;
            long midPower=1;
            for(int i=0;i<n;i++) {
                midPower *= mid;
                if(midPower>m) {
                    break;
                }
            }
            if(midPower==m) {
                return mid;
            } else if(midPower<m) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 4; // Example: cube root
        int m = 69; // Example: number to find the root of
        int result = nthRoot(n, m);
        System.out.println("The " + n + "th root of " + m + " is: " + result);
    }
}
