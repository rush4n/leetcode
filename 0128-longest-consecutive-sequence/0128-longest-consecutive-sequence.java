class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        int longestStreak = 0;

        for (int num : nums) {
            uniqueNums.add(num);
        }

        for (int num : uniqueNums) {
            if (!uniqueNums.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                while (uniqueNums.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                longestStreak = Math.max(longestStreak, currStreak);
            }
        }

        return longestStreak;
    }
}
