class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int minHeight=Integer.MAX_VALUE;
        int maxArea=0;

        for(int i=0;i<height.length;i++){
            minHeight=Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,minHeight*(right-left));
            if(height[left]<height[right]){
                left++;
            }
            else
                right--;
        }
        return maxArea;
    }
}