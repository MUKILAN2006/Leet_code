class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(digit(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
    private int digit(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
}