class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentSum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<n;i++){
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            maxsum=Math.max(maxsum,currentSum);

        }
        return maxsum;
    }
}