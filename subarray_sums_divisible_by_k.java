public class subarray_sums_divisible_by_k {
    public int subarraysDivByK(int[] nums, int k) {
        int n= nums.length;
        int psum[]= new int[n]; //Prefix sum of array
        psum[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            psum[i]=psum[i-1]+nums[i];
        }

        //psum[i]%k
        for(int i=0;i<n;i++)
        {
            psum[i]= ((psum[i] % k) + k) % k;
        }

        //in the array psum we want to find all pairs(i,j) such that psum[i]==psum[j]
        // al the elements in the psum are in the range[0,k-1]
        int freq[] = new int[k];
        int ans=0;
        for(int j=0;j<n;j++)
        {
            //we have fixed j in the pair (i,j)
            ans+=freq[psum[j]];
            freq[psum[j]]++;
            if(psum[j]==0)
            {
                //psum[j] alone satisfies the property as it ranges from (0,j)
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        subarray_sums_divisible_by_k obj = new subarray_sums_divisible_by_k();
        int[] arr = {4,5,0,-2,-3,1};
        int k=5;
        System.out.println(obj.subarraysDivByK(arr, k));
    }
}
