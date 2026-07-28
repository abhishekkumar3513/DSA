class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        Stack<Integer>stack=new Stack<>();
        int leftmin[]=new int[n];
        int rightmin[]=new int[n];
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                leftmin[i]=i+1;
            }
            else{
                leftmin[i]=i-stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                rightmin[i]=n-i;
            }
            else{
                rightmin[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                leftmax[i]=i+1;
            }
            else{
                leftmax[i]=i-stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                rightmax[i]=n-i;
            }
            else{
                rightmax[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        long min=0;
        long max=0;
        for(int i=0;i<n;i++){
            min+=(long) nums[i]*leftmin[i]*rightmin[i];
            max+=(long) nums[i]*leftmax[i]*rightmax[i];
        }
        return max-min;
    }
}