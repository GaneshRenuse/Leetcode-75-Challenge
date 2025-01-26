class Solution {
    public int longestOnes(int[] nums, int k) {
       int left = 0, maxConsecutiveOnes = 0, zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, right - left + 1);
        }

        return maxConsecutiveOnes; 
    }
}
