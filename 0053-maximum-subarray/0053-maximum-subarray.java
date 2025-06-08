class Solution {
    public int maxSubArray(int[] nums) {
        int sol = Integer.MIN_VALUE;
        int currSum = 0;
        
        for (int i = 0; i < nums.length; i++) {  
                if (currSum < 0) currSum = 0;
                currSum += nums[i];
                sol = Math.max(sol, currSum);
            }

        return sol;
    }
}