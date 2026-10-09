class Solution{
    static final long MOD=1000000007;
    public int countGoodNumbers(long n){
        long even=(n+1)/2;
        long odd=n/2;
        return (int)(power(5,even)*power(4,odd)%MOD);
    }
    private long power(long x,long n){
        long ans=1;
        while(n>0){
            if((n&1)==1) ans=ans*x%MOD;
            x=x*x%MOD;
            n>>=1;
        }
        return ans;
    }
}