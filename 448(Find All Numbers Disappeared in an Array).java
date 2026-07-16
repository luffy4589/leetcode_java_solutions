class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     int n=nums.length;
     int a[]=new int[n+1];
     Arrays.fill(a,0);
     for(int i=0;i<n;i++){
      a[nums[i]]=nums[i];
     }
     List<Integer>res=new ArrayList<>();
     for(int i=1;i<a.length;i++){
      if(a[i]==0)  res.add(i);
     }
     return res;
    }
}
