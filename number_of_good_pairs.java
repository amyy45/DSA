public class number_of_good_pairs {

    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[] freq = new int[101];  // array for frequencies

        for (int j = 0; j < n; j++) {
            ans += freq[nums[j]];
            freq[nums[j]] += 1;
        }
        return ans;
    }

    // Main method to run the program
    public static void main(String[] args) {
        number_of_good_pairs obj = new number_of_good_pairs();
        
        // Example input
        int[] nums = {1,2,3,1,1,3};
        
        int result = obj.numIdenticalPairs(nums);
        System.out.println("Number of good pairs = " + result);
    }
}
