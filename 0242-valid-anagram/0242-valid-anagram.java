class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> stringS = frequencyCount(s);
        HashMap<Character, Integer> stringT = frequencyCount(t);

        for (char c : s.toCharArray()) {
            if (!stringS.containsKey(c) || !stringT.containsKey(c)) return false;
            int sCount = stringS.get(c);
            int tCount = stringT.get(c);

            if (sCount != tCount) {
                return false;
            }
        }

        return true;
        
    }

    public HashMap<Character, Integer> frequencyCount(String s) {
        HashMap<Character, Integer> freqs = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (!freqs.containsKey(c)) {
                freqs.put(c, 1);
            } else {
                int count = freqs.get(c);
                freqs.put(c, count + 1);
            }
        }

        return freqs;
    }
}
