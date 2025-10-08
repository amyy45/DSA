package basic_hashing;

import java.util.Arrays;
import java.util.Map;

public class hash_map {
    static void freq(int arr[]) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            } else {
                map.put(arr[i],1);
            }
        }

         int maxFreq = 0, minFreq = arr.length ;
        int maxEle = 0, minEle = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,6,9,8,9,10};
        freq(arr);
    }
}
