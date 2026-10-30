class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int minheight=0;
        int maxArea=Integer.MIN_VALUE;
        while(left<right){
            minheight=Math.min(height[left],height[right]);
            maxArea=Math.max(maxArea,minheight*(right-left));
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