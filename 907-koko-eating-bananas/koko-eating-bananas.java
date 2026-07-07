class Solution {

    public long calculateTotalHours(int[] piles,int speed){
        long totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours+=(int)Math.ceil((double) piles[i]/(double) speed);
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            long totalhour=calculateTotalHours(piles,mid);
            if(totalhour<=h){
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