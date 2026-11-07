class Solution {
    public int calculateTotalhours(int[] piles,int k){
        int totalHours=0;
        for(int i=0;i<piles.length;i++){
            totalHours+=Math.ceil((double)piles[i]/k);
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int ans=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int result=calculateTotalhours(piles,mid);
            if(result<=h){
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