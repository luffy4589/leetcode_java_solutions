class Solution {
    public long countSubarrays(int[] nums, long k) {
      int n=nums.length;
      long count=0, sum = 0;
      int i=0;
      for(int j = 0;j < n;j++){
        sum+=nums[j];
        while(sum*(j-i+1)>=k){
          sum-=nums[i];
          i++;
        }
        count+=(j-i+1);
      }
      return count;
    }
}
