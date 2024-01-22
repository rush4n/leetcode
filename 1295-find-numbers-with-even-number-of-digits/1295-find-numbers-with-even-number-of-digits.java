class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int j : nums) {
            if (isEven(j)) {
                count++;
            }
        }

        return count;
    }

    boolean isEven(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

       return count % 2 == 0;
    }
}