class Solution {
    public long count(int[] bloomDay,int mid,int k){
        long count=0;
        long bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                bouquets+=count/k;
                count=0;
            }
        }
        bouquets+=count/k;
        return bouquets;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            long value=count(bloomDay,mid,k);
            if(value>=m){
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