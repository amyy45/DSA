import java.util.*;
public class koko_eating_bananas {
    public static int calculateTotalHours(int[] piles, int speed) {
        int totalH=0;
        for(int banana:piles) {
            totalH+=(int)Math.ceil((double)banana / speed);
        }
        return totalH;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile=Arrays.stream(piles).max().getAsInt();
        int low=1, high=maxPile;
        int ans=maxPile;
        while(low<=high) {
            int mid=(low+high)/2;
            int totalH= calculateTotalHours(piles, mid);
            if(totalH<=h) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] piles = {7, 15, 6, 3}; // Example banana piles
        int h = 8; // Example hours
        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed to finish bananas in " + h + " hours is: " + result);
    }
}
