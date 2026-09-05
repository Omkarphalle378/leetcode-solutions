class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int left = target - nums[i];
            if(map.containsKey(left)){
                return new int[]{map.get(left),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}