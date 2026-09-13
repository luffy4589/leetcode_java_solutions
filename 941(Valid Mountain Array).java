class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3)  return false;
        int maxval=Integer.MIN_VALUE, maxind=0;
        for(int i=0;i<n;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
                maxind=i;
            }
        }
        if(maxind==0 || maxind==n-1)  return false;
        for(int i=1;i<=maxind;i++){
            if(arr[i]<=arr[i-1]){
                return false;
            }
        }
        for(int i=maxind+1;i<n;i++){
            if(arr[i]>=arr[i-1]){
                return false;
            }
        }

        return true;
    }
}
