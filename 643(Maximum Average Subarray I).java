class Solution {
    public double findMaxAverage(int[] nums, int k) {
      double maxsum = 0.0, windowsum = 0.0;
        for(int i=0;i<k;i++){
            windowsum += nums[i];
        }
        maxsum=windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum += nums[i] - nums[i-k];
            maxsum = Math.max(maxsum,windowsum);
        }
        return maxsum / k;
    }
}
