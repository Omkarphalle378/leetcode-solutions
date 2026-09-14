class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char[] crr = s.toCharArray();

        for(int i=0;i<crr.length;i++){
            if(crr[i]=='6'){
                crr[i] = '9';
                break;
            }
        }
        s = new String(crr);
        return Integer.parseInt(s);
    }
}