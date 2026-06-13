class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxSum=sum;
        int lindex=k-1;
         int rindex=n-1;
        while(lindex>=0){
            sum=sum-cardPoints[lindex];
            sum=sum+cardPoints[rindex];
            lindex--;
            rindex--;
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}