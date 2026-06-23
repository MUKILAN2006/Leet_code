class Solution {
    public int maximumCount(int[] nums) {
        int res=0;
        int pt=0;
        int nt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                pt++;
            else if(nums[i]<0)
                nt++;
        }
        if(pt>nt)
            res=pt;
        else
            res=nt;
        return res;
    }
}