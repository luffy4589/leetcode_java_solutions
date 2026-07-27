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
