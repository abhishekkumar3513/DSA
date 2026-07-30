class Solution {
    public boolean isPalindrome(char [] c,int left, int right){
       while(left<right){
            if(c[left]!=c[right]){
                return false;
            }
            left++;
            right--;
       }
       return true;
    }
    public boolean validPalindrome(String s) {
        char[] c=s.toCharArray();
        int left=0;
        int right=c.length-1;
        while(left<right){
            if(c[left]!=c[right]){
                return isPalindrome(c,left+1,right) ||isPalindrome(c,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
}