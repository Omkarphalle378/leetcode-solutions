class Solution {
    public long fun(int[] piles,int mid){
        int n = piles.length;
        long requiredTime = 0;
        for(int i=0;i<n;i++){
            requiredTime += (piles[i]+mid-1)/mid;
        }
        return requiredTime;
    }
    public int binarySearch(int[] piles,int low,int high,int h){
        while(low<=high){
            int mid = low + (high-low)/2;
            long requiredTime = fun(piles,mid);
            if(requiredTime<=h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int maxi = piles[0];
        for(int i=1;i<n;i++){
            if(piles[i]>maxi){
                maxi = piles[i];
            }
        }

        return binarySearch(piles,1,maxi,h);
    }
}