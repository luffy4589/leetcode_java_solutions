//Brute force
class Solution {
    public int maxProduct(int[] nums) {
      int prod=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          int cur=(nums[i]-1)*(nums[j]-1);
          if(prod<cur){
            prod=cur;
          }
        }
      }
      return prod;
    }
}

//using sorr only
class Solution {
    public int maxProduct(int[] nums) {
      Arrays.sort(nums);
      return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    }
}

//optimal
class Solution {
    public int maxProduct(int[] nums) {
      //int n=nums.length;
      int m1=0,m2=0;
      for(int n:nums){
        if(n>m1){
          m2=m1;
          m1=n;
        }
        else if(n>m2){
          m2=n;
        }
      }
      return (m1-1)*(m2-1);
    }
}
