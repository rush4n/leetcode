class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> freqs = new HashMap<>();

        for (int num : nums) {
            freqs.put(num, freqs.getOrDefault(num, 0) + 1);
        }

        for (int key : freqs.keySet()) {
            int frequency = freqs.get(key);

            if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
        }

        int[] result = new int[k];
        int counter = 0;

        for (int i = bucket.length - 1; i >= 0 && counter < k; i--) {
            if (bucket[i] != null) {
                for (Integer key: bucket[i]) {
                    if (counter == k) break;
                    result[counter++] = key;
                }
            }
        }

        return result;
    }
}
