class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0,maxsum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxsum=sum;
        int l=0,r=k;
        while(r<n){
            sum=sum-nums[l];
            sum=sum+nums[r];
            l++;
            r++;
            maxsum=Math.max(sum,maxsum);
        }
       return (double) maxsum/k;
    }
}