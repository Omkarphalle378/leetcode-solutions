class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        char[] crr = s.toCharArray();
        int length = crr.length;

        for(int i=0;i<length;i++){
            sum += (i+1) * ('z'-crr[i]+1);
        }

        return sum;
    }
}