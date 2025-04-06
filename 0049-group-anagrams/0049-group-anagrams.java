class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs.length == 0 || strs == null) return new ArrayList<>();
        Map<String, List<String>> freqs = new HashMap<>();

       for (String str : strs) {
        String key = getFrequency(str);

        if (freqs.containsKey(key)) {
            freqs.get(key).add(str);
        } else {
            List<String> anagrams = new ArrayList<>();
            anagrams.add(str);
            freqs.put(key, anagrams);
        }
       }

        return new ArrayList<>(freqs.values());

    }

    public String getFrequency(String str) {
        int[] counts = new int[26];
        for (char c : str.toCharArray()) {
            counts[c - 'a']++;
        }

        StringBuilder key = new StringBuilder();

        for (int count : counts) {
            key.append(count).append("#");
        }

        return key.toString();
    }
}
