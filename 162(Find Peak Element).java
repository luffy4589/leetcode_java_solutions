class Solution {
    public int findPeakElement(int[] nums) {
      int n=nums.length;
      /**if(n==1)  return 0;
      if((n==2)&&(nums[1]>nums[0]))  return 1;
      int index=0;
      for(int i=1;i<n-1;++i){
        if((nums[i]>nums[i-1])&&(nums[i]>nums[i+1])){
          index=i;
        }
      }**/
      int mi=0,max=nums[0];
      for(int i=1;i<n;i++){
        if(nums[i]>max){
          max=nums[i];
          mi=i;
        }
      }
      return mi;
    }
}
