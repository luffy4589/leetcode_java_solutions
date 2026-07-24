//Brute force
class Solution {
    public int uniqueXorTriplets(int[] nums) {
      int n = nums.length;
      int count = 0;
      HashSet<Integer>s=new HashSet<>();
      for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
          for (int k = j; k < n; k++) {
            int x=nums[i] ^ nums[j] ^ nums[k];
            if(!s.contains(x)){
              count++;
              s.add(x);
            }
          }
        }
      }
      return count;
    }
}
