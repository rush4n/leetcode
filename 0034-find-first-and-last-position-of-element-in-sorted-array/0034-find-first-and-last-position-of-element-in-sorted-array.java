class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] answer = {-1, -1};

        answer[0] = search(nums, target, true);
        if (answer[0] != -1) {
            answer[1] = search(nums, target, false);
        }

        return answer;
    }

    public int search(int[] nums, int target, boolean findStartIndex) {
        int answer = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) /2;

            if (target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                answer = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return answer;
    }
}