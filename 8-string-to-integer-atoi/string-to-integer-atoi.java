class Solution {
    public int myAtoi(String s) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int sign=1;
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        if(i==s.length()){
            return 0;
        }
        if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        else if(i<s.length() && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        long result=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            result=result*10+digit;

            if(sign*result<=min){
                return min;
            }
            else if(sign*result>=max){
                return max;
            }
            i++;
        }
        return (int)(result*sign);
    }
}