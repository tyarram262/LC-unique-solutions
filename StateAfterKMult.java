class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
    for(int j=0;j<k;j++){
            int min = 2147483647;
            int minInd = 0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min = nums[i];
                minInd = i;
            }
        }
        nums[minInd] = min*multiplier;
    }
    return nums;
    }
}