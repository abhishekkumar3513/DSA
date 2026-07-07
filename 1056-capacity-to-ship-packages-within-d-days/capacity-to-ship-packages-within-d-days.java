class Solution {
    public int reqDay(int[] weights,int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+load>capacity){
                days=days+1;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=0;
        int high=0;
        int ans=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int requiredDay=reqDay(weights,mid);
            if(requiredDay<=days){
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