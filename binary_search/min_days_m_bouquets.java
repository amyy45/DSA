import java.util.*;
public class min_days_m_bouquets {
    public static boolean isPossible(int[] bloomDays,int day,int m,int k) {
        int count=0;
        int bouquets=0;
        for(int bloom : bloomDays) {
            if(bloom<=day) {
                count++;
                if(count==k) {
                    bouquets++;
                    count=0;
                }
            } else {
                count=0;
            }
        }
        return bouquets>=m;
    }
    public static int minDays(int[] bloomDays,int m, int k) {
        long totalFlowers=(long)m*k;
        if(totalFlowers>bloomDays.length) return -1;
        int min=Arrays.stream(bloomDays).min().getAsInt();
        int max=Arrays.stream(bloomDays).max().getAsInt();
        for(int day=min;day<=max;day++) {
            if(isPossible(bloomDays,day,m,k)) {
                max=day;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] bloomDays={7,7,7,7,13,11,12,7};
        int k=3;
        int m=2;
        int result=minDays(bloomDays,m,k);
        if(result==-1) {
            System.out.println("Not Possible");
        } else {
            System.out.println("Minimum days required: "+result);
        }
    }
}
