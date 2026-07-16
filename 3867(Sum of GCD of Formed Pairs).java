class Solution {
    public long gcdSum(int[] nums) {
        int a[]=new int[nums.length];
        int mx=0;
        for(int i=0;i<nums.length;i++){
          mx = Math.max(nums[i],mx);
          a[i]=gcd(nums[i],mx);
        }
        Arrays.sort(a);
        int i=0,j=a.length-1;
        long sum=0;
        while(i<j){
          sum+=gcd(a[i],a[j]);
          i++;
          j--;
        }
        return sum;
    }

    static int gcd(int a, int b){
      if(b==0) return a;

      return gcd(b, a % b);
    }
}
