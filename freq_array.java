public class freq_array {
    public static void main(String[] args)
    {
        int[] arr = {1,2,2,4,5,6,9,8,9,10};
        int max_value =arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
        }
        int[] freq_array=new int[max_value+1];
        for(int i=0;i<arr.length;i++){
            freq_array[arr[i]]++;
        }
        for(int i=0;i<freq_array.length;i++){
            System.out.print(freq_array[i]+" ");
        }
    }
}
