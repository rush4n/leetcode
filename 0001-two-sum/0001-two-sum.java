class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndex = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            int key = target-num;

            if (numIndex.containsKey(key)) {
                int val = numIndex.get(key);
                return new int[] {val, i};
            }

            numIndex.put(num, i);
        }

        return new int[] {};
    }
}