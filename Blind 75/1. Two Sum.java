class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> ans = new HashMap<>();

        int n = nums.length;

        for(int i = 0; i < n; i++){
            int num = nums[i];
            int moreNeeded = target - num;

            if(ans.containsKey(moreNeeded)){
                return new int[]{ans.get(moreNeeded), i};
            }

            ans.put(nums[i], i);

        }
        return new int[]{-1,-1};
        
    }
}
