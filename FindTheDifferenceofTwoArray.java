class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use HashSet to store unique elements from nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Populate both sets
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        // Prepare results
        return Arrays.asList(getDifference(set1, set2), getDifference(set2, set1));
    }

    // Helper function to get elements in set1 but not in set2
    private static List<Integer> getDifference(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> result = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }
}
