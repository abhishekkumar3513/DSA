class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int minHeight=0;
        int maxArea=Integer.MIN_VALUE;
        while(left<right){
            minHeight=Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,minHeight*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}