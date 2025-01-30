class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        Set<Integer> occurrences = new HashSet<>();
        
        for (int count : countMap.values()) {
            if (!occurrences.add(count)) {
                return false;
            }
        }
        
        return true;
    }
}
