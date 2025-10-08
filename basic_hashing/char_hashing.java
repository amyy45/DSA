package basic_hashing;

public class char_hashing {
    public static void main(String[] args) {
        String str="Hello World";
        int[] freq_array=new int[256];
        for(int i=0;i<str.length();i++) {
            freq_array[str.charAt(i)]++;
        }

        System.out.println("Character Frequency:");
        int[] query={'H','e','l','o','W','r','d'};
        for(int i=0;i<freq_array.length;i++){
            for(int q:query) {
                if(i==q){
                    System.out.println((char)i+" -> "+freq_array[i]);
                }
            }
        }
    }
}
