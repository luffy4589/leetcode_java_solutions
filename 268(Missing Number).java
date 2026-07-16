//Using Natural numbers sum formula
class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length,s=0;
      for(int i=0;i<n;i++){
        s+=nums[i];
      }
      int t=(n*(n+1))/2;
      return t-s;
    }
}

//Using additional array
class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length,s=0;
      int a[]=new int[n+1];
      Arrays.fill(a,-1);
      for(int i=0;i<n;i++){
        a[nums[i]]=nums[i];
      }
      for(int i=0;i<a.length;i++){
        if(a[i]==-1)  return i;
      }
      return 0;
    }
}
