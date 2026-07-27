class Solution {
    public int trap(int[] height) {
    //     int n=height.length;
    //     if(n==0){
    //         return 0;
    //     }
    //     int [] leftmax=new int[n];
    //     int [] rightmax=new int[n];
    //     leftmax[0]=height[0];
    //     rightmax[n-1]=height[n-1];
    //     for(int i=1;i<n;i++){
    //         leftmax[i]=Math.max(leftmax[i-1],height[i]);
    //     }
    //     for(int i=n-2;i>=0;i--){
    //         rightmax[i]=Math.max(rightmax[i+1],height[i]);
    //     }
    //     int totalWater=0;
    //     for(int i=0;i<n;i++){
    //         totalWater+=Math.min(leftmax[i],rightmax[i])-height[i];
    //     }
    //     return totalWater;
    // }
//}
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    water+=leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    water+=rightmax-height[right];
                }
                 right--;
            }
            
        }
        return water;
    }
}
