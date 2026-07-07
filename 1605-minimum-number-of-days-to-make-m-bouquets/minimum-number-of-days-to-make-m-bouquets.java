class Solution {
    public int bloom(int[] bloomDay,int day,int k){
        int consecutiveFlowers=0;
        int bouquetCount=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                consecutiveFlowers++;
            }
            else{
                bouquetCount+=consecutiveFlowers/k;
                consecutiveFlowers=0;
            }
        }
        bouquetCount+=consecutiveFlowers/k;
        return bouquetCount;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=0;
        int ans=0;
        for(int i=0;i<n;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            int value=bloom(bloomDay,mid,k);
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