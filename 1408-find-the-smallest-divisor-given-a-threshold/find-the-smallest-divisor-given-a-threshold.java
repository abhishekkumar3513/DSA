class Solution {
    public int countValue(int[] nums, int mid){
        int count=0;
        for(int i=0;i<nums.length;i++){
            count+=Math.ceil((double)nums[i]/mid);
        }
        return count;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        int low=1;
        int high=0;
        int ans=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,nums[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int values=countValue(nums,mid);
            if(values<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}