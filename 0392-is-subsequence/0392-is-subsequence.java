class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        boolean flag = false;
        int j=0;
        for(int i=0;i<n;i++){
            flag = false;
            for(;j<m;j++){
                if(s.charAt(i)==t.charAt(j)){
                    flag = true;
                    j++;
                    break;
                }
            }
            if(flag==false) return false;
        }
        return true;
    }
}