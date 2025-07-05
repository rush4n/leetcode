import java.util.*;

class Solution {
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combination = new ArrayList<>();
        f(0, target, combination, candidates);
        return answer;
    }

    void f(int i, int rem, List<Integer> list, int[] candidates) {
        if (i == candidates.length) {
            if (rem == 0) {
                answer.add(new ArrayList<>(list));
            }
        } else {
            int maxTimes = rem / candidates[i];
            for (int k = 0; k <= maxTimes; k++) {
                int newTarget = rem - k * candidates[i];
                for (int j = 0; j < k; j++) {
                    list.add(candidates[i]);
                }
                f(i + 1, newTarget, list, candidates);
                for (int j = 0; j < k; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}
