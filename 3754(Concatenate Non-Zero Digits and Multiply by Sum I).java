class Solution {
    public long sumAndMultiply(int n) {
      long x=0,r=1,s=0;
      while(n>0){
        int rem=n%10;
        n/=10;
        if(rem==0)  continue;
        x=rem*r+x;
        s+=rem;
        r*=10;
      }
      return x*s;
    }
}
