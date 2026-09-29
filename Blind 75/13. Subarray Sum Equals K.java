class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> mpp = new HashMap<>();

        mpp.put(0 , 1);

        int prefixSum = 0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;

            int target = prefixSum - k;

            count += mpp.getOrDefault(target, 0);

            mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
