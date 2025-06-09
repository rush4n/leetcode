class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int currCount = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) currCount++ ;
            else { 
                count = Math.max(count, currCount);
                currCount = 0; 
            }
            
        }
        count = Math.max(count, currCount);

        return count;
    }
}