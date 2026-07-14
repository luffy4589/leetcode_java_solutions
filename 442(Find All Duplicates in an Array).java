class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      HashMap<Integer, Integer> hm = new HashMap<>();

      for(int i=0;i<nums.length;i++){
        hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
      }

      List<Integer> a = new ArrayList<>();
      for(Map.Entry<Integer, Integer> m : hm.entrySet()){
        if(m.getValue() > 1){
          a.add(m.getKey());
        }
      }

      return a;
    }
}
