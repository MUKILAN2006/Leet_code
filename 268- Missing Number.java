class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=n*(n+1)/2;
        int val=0;
        for(int num:nums)
            val+=num;
        return res-val;
    }
}