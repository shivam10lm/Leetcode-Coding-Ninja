class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int expected = count[s.charAt(0) - 'a'];

        for (int freq : count) {
            if (freq != 0 && freq != expected) {
                return false;
            }
        }

        return true;
    }
}
