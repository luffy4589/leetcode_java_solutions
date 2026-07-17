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

//O(nlogn)
class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
      if(n==0)  return 0;
      Arrays.sort(nums);
      int lcs=0,currlcs=1;
      for(int i=1;i<n;i++){
        if(nums[i]==nums[i-1]){
          continue;
        }
        if(nums[i]==nums[i-1]+1){
          currlcs++;
        }
        else{
          lcs=Math.max(lcs,currlcs);
          currlcs=1;
        }
      }
      return Math.max(lcs,currlcs); 
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
      if(n==0)  return 0;
      Set<Integer>set=new HashSet<>();
      for(int i=0;i<n;i++){
        set.add(nums[i]);
      }
      int lcs=0;
      for(int a:set){
        if(!set.contains(a-1)){
          int curr=a;
          int currlcs=1;
          while(set.contains(curr+1)){
            curr++;
            currlcs++;
          }
          lcs=Math.max(lcs,currlcs);
        }
      }
      return lcs; 
    }
}
