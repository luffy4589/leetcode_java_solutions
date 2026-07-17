//Time limit exceeded
class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
      int lcs=0;
      for(int i=0;i<n;i++){
        int curr=nums[i];
        int curlcs=1;
        while(longest(nums,curr+1)){
          curr+=1;
          curlcs++;
        }
        lcs=Math.max(lcs,curlcs);
      }
      return lcs; 
    }
    static boolean longest(int[] nums,int curr){
      for(int i=0;i<nums.length;i++){
        if(nums[i]==curr){
          return true;
        }
      }
      return false;
    }
}
