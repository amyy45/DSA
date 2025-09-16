public class prefix_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] prefix_sum= new int[arr.length];
        prefix_sum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_sum[i]=prefix_sum[i-1]+arr[i];
        }
        for(int i=0;i<prefix_sum.length;i++){
            System.out.print(prefix_sum[i]+" ");
        }
    }
    
}
