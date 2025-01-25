class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += "aeiou".indexOf(s.charAt(i)) >= 0 ? 1 : 0;
            if (i >= k) count -= "aeiou".indexOf(s.charAt(i - k)) >= 0 ? 1 : 0;
            maxVowels = Math.max(maxVowels, count);
            if (maxVowels == k) return k;
        }
        return maxVowels;
    }
}
