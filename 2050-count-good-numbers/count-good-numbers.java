class Solution {
    private int MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=(n/2);
        long first=power(5,even)%MOD;
        long second=power(4,odd)%MOD;
        return (int)((first*second)%MOD);
    }
    public long power(long x,long n){
        if(n==0){
            return 1;
        }
        long half=power(x,n/2);
        if(n%2==0){
            return (half*half)%MOD;
        }
        return (x*half*half)%MOD;
    }
}