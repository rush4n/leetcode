class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] = sum[i] + accounts[i][j];
            }
        }

        for (int ints : sum) {
            if (ints > max) {
                max = ints;
            }
        }
        return max;
        
    }
}