class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int minsize=Integer.MAX_VALUE, sum=0;
      int i=0,j=0;
      while(j<nums.length){
        sum+=nums[j++];
        while(sum>=target){
          minsize=Math.min(minsize,(j-i));
          sum-=nums[i++];
        }
      }
      return minsize==Integer.MAX_VALUE?0:minsize;
    }
}
