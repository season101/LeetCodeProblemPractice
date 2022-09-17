class Solution {
    public int pivotIndex(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        
        for(int i=1;i<nums.length;i++){
            rsum+=nums[i];
        }
        if (lsum==rsum) return 0;

        for(int j=1;j<nums.length;j++){
            lsum=lsum+nums[j-1];
            rsum=rsum-nums[j];
            if (lsum==rsum) return j;
        }
        return -1;
    }
}