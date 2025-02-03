class Solution {
    public String removeStars(String s) {

        StringBuilder Answer = new StringBuilder();

        for(char c : s.toCharArray())
        {
            if(c == '*')
            { 
                Answer.deleteCharAt(Answer.length()-1);
            }
            else
            {
                Answer.append(c);
            }
        }

        return Answer.toString();
    }
}