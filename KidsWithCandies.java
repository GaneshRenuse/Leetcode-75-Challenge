class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int i = 1; i < candies.length; i++)
        {
            if (candies[i] > max)
                max = candies[i];
        }

        int size = candies.length;
        List<Boolean> result = new ArrayList<>();

        for(int j = 0; j < size; j++){
            if(candies[j] + extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }

        return result;
    }
}
