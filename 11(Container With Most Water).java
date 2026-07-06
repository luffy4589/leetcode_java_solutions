class Solution {
    public int maxArea(int[] height) {
      int l=0, r=height.length - 1;
      int maxarea = 0;
      while(l<r){
        maxarea = Math.max(maxarea, (r-l)*Math.min(height[l],height[r]));
        if(height[l]>height[r]){
          r--;
        }
        else{
          l++;
        }
      }
      return maxarea;
    }
}
