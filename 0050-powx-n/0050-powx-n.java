class Solution{
    public double myPow(double x,int n){
        long N=n;
        if(N<0) return 1.0/power(x,-N);
        return power(x,N);
    }
    private double power(double x,long n){
        double ans=1.0;
        while(n>0){
            if((n&1)==1) ans*=x;
            x*=x;
            n>>=1;
        }
        return ans;
    }
}